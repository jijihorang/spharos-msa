package com.spharos6th.authservice.application.mapper;

import com.spharos6th.authservice.application.port.out.dto.AuthResponseDto;
import com.spharos6th.authservice.application.port.out.dto.AuthenticationRequestDto;
import com.spharos6th.authservice.domain.model.AuthDomain;
import org.springframework.stereotype.Component;

@Component
public class AuthMapper {

    // 어댑터의 트랜잭션을 도메인으로 변환하는 메서드가 필요함 !
    public AuthenticationRequestDto toSignInDto(AuthDomain authDomain) {
        return AuthenticationRequestDto.builder()
                .userId(authDomain.getUserId())
                .password(authDomain.getPassword())
                .build();
    }

    // dto → 도메인으로 갈어타기
    public AuthDomain toAuthDomain(AuthResponseDto authResponseDto) {
        return AuthDomain.builder()
                .userId(authResponseDto.getUserId())
                .password(authResponseDto.getPassword())
                .build();
    }
}