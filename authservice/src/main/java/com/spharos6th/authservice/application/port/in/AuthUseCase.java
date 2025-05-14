package com.spharos6th.authservice.application.port.in;

import com.spharos6th.authservice.application.port.in.dto.AuthSignInRequestDto;

public interface AuthUseCase {

    void signUp();

    String signIn(AuthSignInRequestDto authSignInRequestDto);
}
