package com.spharos6th.authservice.adaptor.out.mongo.repository;

import com.spharos6th.authservice.adaptor.out.mongo.entity.AuthMongoEntity;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.Optional;

public interface AuthMongoDataRepository extends MongoRepository<AuthMongoEntity, String> {

    Optional<AuthMongoEntity> findByUserId(String userId);

    AuthMongoEntity findByEmail(String email);
}

