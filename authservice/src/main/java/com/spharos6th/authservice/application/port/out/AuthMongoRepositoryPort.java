package com.spharos6th.authservice.application.port.out;

import com.spharos6th.authservice.application.port.out.dto.AuthResponseDto;

import java.util.Optional;

public interface AuthMongoRepositoryPort {

    Optional<AuthResponseDto> findByUserId(String userId);
}
