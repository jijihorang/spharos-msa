package com.kafka.feed_service.adaptor.out.mysql.repository;

import com.kafka.feed_service.adaptor.out.mysql.entity.FeedEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface FeedJpaRepository extends JpaRepository<FeedEntity, String> {

    Optional<FeedEntity> findByFeedUuid(String feedUuid);

    List<FeedEntity> findByAuthorId(String authorId);
}
