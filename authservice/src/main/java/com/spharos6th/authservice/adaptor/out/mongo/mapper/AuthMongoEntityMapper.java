package com.spharos6th.authservice.adaptor.out.mongo.mapper;

import com.spharos6th.authservice.adaptor.out.mongo.entity.AuthMongoEntity;
import com.spharos6th.authservice.application.port.out.dto.AuthResponseDto;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;
import java.time.ZoneId;

@Component
public class AuthMongoEntityMapper {

    public AuthMongoEntity toEntity() {
        return AuthMongoEntity.builder()
                .authUuid("authUuid")
                .userId("userId")
                .email("email")
                .password("password")
                .name("name")
                .isDeleted(false)
                .build();
    }

    public AuthResponseDto toDto(AuthMongoEntity authMongoEntity) {
        return AuthResponseDto.builder()
                .authId(authMongoEntity.getAuthUuid())
                .userId(authMongoEntity.getUserId())
                .email(authMongoEntity.getEmail())
                .password(authMongoEntity.getPassword())
                .name(authMongoEntity.getName())
                .isDeleted(authMongoEntity.isDeleted())
                .createdAt(LocalDateTime.ofInstant(authMongoEntity.getCreatedAt(), ZoneId.systemDefault()))
                .build();
    }
}
