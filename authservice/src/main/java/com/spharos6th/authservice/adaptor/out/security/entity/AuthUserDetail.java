package com.spharos6th.authservice.adaptor.out.security.entity;

import com.spharos6th.authservice.adaptor.out.mysql.entity.AuthEntity;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.Collection;

@Getter
@NoArgsConstructor
public class AuthUserDetail implements UserDetails {

    private String authId;

    private String userId;

    private String password;

    private String email;

    @Builder
    public AuthUserDetail(AuthEntity authEntity) {
        this.authId = authEntity.getAuthId();
        this.userId = authEntity.getUserId();
        this.password = authEntity.getPassword();
        this.email = authEntity.getEmail();
    }

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return null;
    }

    @Override
    public String getPassword() {
        return this.password;
    }

    @Override
    public String getUsername() {
        return this.userId;
    }

    @Override
    public boolean isAccountNonExpired() {
        return true;
    }

    @Override
    public boolean isAccountNonLocked() {
        return true;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }

    @Override
    public boolean isEnabled() {
        return false;
    }
}
