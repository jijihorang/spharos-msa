package com.spharos6th.authservice.adaptor.out.mongo.repository;

import com.spharos6th.authservice.adaptor.out.mongo.mapper.AuthMongoEntityMapper;
import com.spharos6th.authservice.application.port.out.AuthMongoRepositoryPort;
import com.spharos6th.authservice.application.port.out.dto.AuthResponseDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
@RequiredArgsConstructor
public class AuthMongoRepositoryImpl implements AuthMongoRepositoryPort {

    private final AuthMongoDataRepository authMongoRepository;

    private final AuthMongoEntityMapper authMongoEntityMapper;

    @Override
    public Optional<AuthResponseDto> findByUserId(String userId) {
        return authMongoRepository.findByUserId(userId).map(authMongoEntityMapper::toDto);
    }
}
