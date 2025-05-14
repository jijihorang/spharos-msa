package com.spharos6th.authservice.adaptor.out.mysql.repository;

import com.spharos6th.authservice.adaptor.out.mysql.entity.AuthEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AuthJpaRepository extends JpaRepository<AuthEntity, Long> {

    AuthEntity findByUserId(String userId);
}
