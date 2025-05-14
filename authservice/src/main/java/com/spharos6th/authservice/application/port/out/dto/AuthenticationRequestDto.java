package com.spharos6th.authservice.application.port.out.dto;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public class AuthenticationRequestDto {

    private String userId;

    private String password;

    @Builder
    public AuthenticationRequestDto(String userId, String password) {
        this.userId = userId;
        this.password = password;
    }
}
