package com.kafka.feed_reed_service.adaptor.out.infrastructure.mongodb.repository;

import com.kafka.feed_reed_service.adaptor.out.infrastructure.mongodb.entity.FeedReadMongoEntity;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FeedReadMongoRepository extends MongoRepository<FeedReadMongoEntity, String> {

}
