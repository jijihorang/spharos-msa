package com.spharos6th.authservice.adaptor.in.web.vo;

import lombok.Getter;
import lombok.ToString;

@ToString
@Getter
public class AuthSignInRequestVo {

    private String userId;

    private String password;
}
