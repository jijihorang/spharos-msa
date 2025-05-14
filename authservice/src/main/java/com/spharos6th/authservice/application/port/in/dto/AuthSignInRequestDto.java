package com.spharos6th.authservice.application.port.in.dto;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public class AuthSignInRequestDto {

    private String userId;

    private String password;

    @Builder
    public AuthSignInRequestDto(String userId, String password) {
        this.userId = userId;
        this.password = password;
    }
}
