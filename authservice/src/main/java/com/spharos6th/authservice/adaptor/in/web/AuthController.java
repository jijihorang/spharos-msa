package com.spharos6th.authservice.adaptor.in.web;

import com.spharos6th.authservice.adaptor.in.web.mapper.AuthVoMapper;
import com.spharos6th.authservice.adaptor.in.web.vo.AuthSignInRequestVo;
import com.spharos6th.authservice.application.port.in.AuthUseCase;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequestMapping("/api/v1/auth")
@RequiredArgsConstructor
public class AuthController {

    private final AuthUseCase authUseCase;

    private final AuthVoMapper authVoMapper;

    @PostMapping("/sign-in")
    public String signIn(@RequestBody AuthSignInRequestVo authSignInRequestVo) {
        log.info("SignIn request: {}", authSignInRequestVo);
        return authUseCase.signIn(authVoMapper.toSignInDto(authSignInRequestVo));
    }
}
