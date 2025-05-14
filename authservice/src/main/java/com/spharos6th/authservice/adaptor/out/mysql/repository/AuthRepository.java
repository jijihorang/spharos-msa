package com.spharos6th.authservice.adaptor.out.mysql.repository;

import com.spharos6th.authservice.adaptor.out.mysql.mapper.AuthEntityMapper;
import com.spharos6th.authservice.application.port.out.AuthRepositoryPort;
import com.spharos6th.authservice.application.port.out.dto.AuthResponseDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
@RequiredArgsConstructor
public class AuthRepository implements AuthRepositoryPort {

    private final AuthJpaRepository authJpaRepository;

    private final AuthEntityMapper authEntityMapper;

    @Override
    public Optional<AuthResponseDto> findByUserId(String userId) {
        return Optional.ofNullable(authEntityMapper.toDto(authJpaRepository.findByUserId(userId))); // 엔티티 → dto 변환
    }
}
