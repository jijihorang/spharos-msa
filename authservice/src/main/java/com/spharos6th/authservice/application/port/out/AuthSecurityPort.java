package com.spharos6th.authservice.application.port.out;

import com.spharos6th.authservice.application.port.out.dto.AuthenticationRequestDto;

public interface AuthSecurityPort {

    String signIn(AuthenticationRequestDto authenticationRequestDto, String inputPassword);
}
