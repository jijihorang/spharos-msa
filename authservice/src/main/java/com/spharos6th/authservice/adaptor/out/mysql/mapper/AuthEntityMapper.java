package com.spharos6th.authservice.adaptor.out.mysql.mapper;

import com.spharos6th.authservice.adaptor.out.mysql.entity.AuthEntity;
import com.spharos6th.authservice.application.port.out.dto.AuthResponseDto;
import org.springframework.stereotype.Component;

@Component
public class AuthEntityMapper {

    public AuthResponseDto toDto(AuthEntity authEntity) {
        return AuthResponseDto.builder()
                .authId(authEntity.getAuthId())
                .userId(authEntity.getUserId())
                .email(authEntity.getEmail())
                .password(authEntity.getPassword())
                .name(authEntity.getName())
                .isDeleted(authEntity.isDeleted())
                .createdAt(authEntity.getCreatedAt())
                .build();
    }
}
