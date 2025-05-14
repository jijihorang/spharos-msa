package com.spharos6th.authservice.adaptor.out.security.repository;

import com.spharos6th.authservice.adaptor.out.security.provider.JwtTokenProvider;
import com.spharos6th.authservice.application.port.out.AuthSecurityPort;
import com.spharos6th.authservice.application.port.out.dto.AuthenticationRequestDto;
import lombok.RequiredArgsConstructor;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class AuthSecurityRepository implements AuthSecurityPort {

    private final AuthenticationManager authenticationManager;
    private final JwtTokenProvider jwtTokenProvider;

    // sign Up
    private final PasswordEncoder passwordEncoder;

    @Override
    public String signIn(AuthenticationRequestDto authenticationRequestDto, String inputPassword) {
        if(authenticationManager.authenticate(
                new UsernamePasswordAuthenticationToken(
                        authenticationRequestDto.getUserId(),
                        inputPassword
                )
        ).isAuthenticated()) {
            return jwtTokenProvider.generateAccessToken();
        } else {
            throw new RuntimeException("failed to sign in");
        }
    }
}
