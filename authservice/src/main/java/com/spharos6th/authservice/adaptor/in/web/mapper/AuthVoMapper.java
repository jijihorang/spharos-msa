package com.spharos6th.authservice.adaptor.in.web.mapper;

import com.spharos6th.authservice.adaptor.in.web.vo.AuthSignInRequestVo;
import com.spharos6th.authservice.application.port.in.dto.AuthSignInRequestDto;
import org.springframework.stereotype.Component;

@Component
public class AuthVoMapper {

    public AuthSignInRequestDto toSignInDto(AuthSignInRequestVo authSignInRequestVo) {
        return AuthSignInRequestDto.builder()
                .userId(authSignInRequestVo.getUserId())
                .password(authSignInRequestVo.getPassword())
                .build();
    }
}
