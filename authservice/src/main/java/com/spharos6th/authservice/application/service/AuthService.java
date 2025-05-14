package com.spharos6th.authservice.application.service;

import com.spharos6th.authservice.application.mapper.AuthMapper;
import com.spharos6th.authservice.application.port.in.AuthUseCase;
import com.spharos6th.authservice.application.port.in.dto.AuthSignInRequestDto;
import com.spharos6th.authservice.application.port.out.AuthRepositoryPort;
import com.spharos6th.authservice.application.port.out.AuthSecurityPort;
import com.spharos6th.authservice.application.port.out.dto.AuthResponseDto;
import com.spharos6th.authservice.application.port.out.dto.AuthenticationRequestDto;
import com.spharos6th.authservice.domain.model.AuthDomain;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class AuthService implements AuthUseCase {

    private final AuthRepositoryPort authRepositoryPort;

    private final AuthSecurityPort authSecurityPort;

    private final AuthMapper authMapper;

    @Override
    public void signUp() {

    }

    @Override
    public String signIn(AuthSignInRequestDto authSignInRequestDto) {
        AuthResponseDto authResponseDto = authRepositoryPort.findByUserId(authSignInRequestDto.getUserId())
                .orElseThrow(() -> new RuntimeException("user not found"));

        AuthDomain authDomain = authMapper.toAuthDomain(authResponseDto);
        AuthenticationRequestDto authenticationRequestDto = authMapper.toSignInDto(authDomain);
        return authSecurityPort.signIn(authenticationRequestDto, authSignInRequestDto.getPassword());
    }
}