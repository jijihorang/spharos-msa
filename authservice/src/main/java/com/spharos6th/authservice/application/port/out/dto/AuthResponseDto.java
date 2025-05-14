package com.spharos6th.authservice.application.port.out.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Getter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class AuthResponseDto {

    private String userId;

    private String name;

    private String email;

    private String password;

    private String authId;

    private LocalDateTime createdAt;

    private LocalDateTime updatedAt;

    private boolean isDeleted;
}
