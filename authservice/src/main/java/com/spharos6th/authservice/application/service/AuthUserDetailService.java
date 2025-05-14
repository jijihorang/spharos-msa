package com.spharos6th.authservice.application.service;

import com.spharos6th.authservice.application.port.out.AuthRepositoryPort;
import lombok.RequiredArgsConstructor;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.Collections;

// security 해당하는 서비스
@Service
@RequiredArgsConstructor
public class AuthUserDetailService implements UserDetailsService {

    private final AuthRepositoryPort authRepository;

    @Override
    public UserDetails loadUserByUsername(String userId) throws UsernameNotFoundException {
        return authRepository.findByUserId(userId)
                .map(authResponseDto -> new User(authResponseDto.getUserId(),
                        authResponseDto.getPassword(), Collections.emptyList()))
                .orElseThrow(() -> new UsernameNotFoundException("User not found"));
    }
}
