package com.spharos6th.authservice.adaptor.out.mysql.entity;

import com.spharos6th.authservice.adaptor.out.mysql.common.BaseEntity;
import jakarta.persistence.*;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Getter
@NoArgsConstructor
public class AuthEntity extends BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(unique = true, nullable = false, length = 50)
    private String authId;

    @Column(unique = true, nullable = false, length = 50)
    private String userId;

    @Column(nullable = false, length = 100)
    private String password;

    @Column(unique = true, nullable = false, length = 50)
    private String email;

    @Column(nullable = false, length = 50)
    private String name;

    private boolean isDeleted;

    @Builder
    public AuthEntity(Long id, String authId, String userId,
                      String password, String email, String name) {
        this.id = id;
        this.authId = authId;
        this.userId = userId;
        this.password = password;
        this.email = email;
        this.name = name;
    }
}
