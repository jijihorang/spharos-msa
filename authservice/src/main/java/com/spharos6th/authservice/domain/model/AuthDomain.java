package com.spharos6th.authservice.domain.model;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Getter
@NoArgsConstructor
public class AuthDomain {

    // 엔티티가 아니기 때문에 id 없음 (엔티티 어노테이션 없고, id 없음 !
    // userUuid 별도로 관리 시 fk만 관리하면 쉬워짐 (마리그레이션 쉬움 -> 데이터베이스 변경 가능함 !)
    // domain -> 필요한 필드를 명확하게 정의해야 함 ! (baseEntity 사용 x)

    private String authUuid;

    private String userId;

    private String password;

    private String email;

    private String name;

    private boolean isDeleted;

    private LocalDateTime createdAt;

    private LocalDateTime updatedAt;

    @Builder
    public AuthDomain(String authUuid, String userId, String password,
                      String email, String name, boolean isDeleted,
                      LocalDateTime createdAt, LocalDateTime updatedAt) {
        this.authUuid = authUuid;
        this.userId = userId;
        this.password = password;
        this.email = email;
        this.name = name;
        this.isDeleted = isDeleted;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
    }
}
