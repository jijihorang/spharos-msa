package com.spharos6th.authservice.adaptor.out.mongo.entity;

import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.Instant;

@Document
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class AuthMongoEntity {

    @Id
    private String id;

    private String authUuid;

    private String userId;

    private String email;

    private String password;

    private String name;

    private boolean isDeleted;

    @CreatedDate
    private Instant createdAt;

    @LastModifiedDate
    private Instant updatedAt;
}
