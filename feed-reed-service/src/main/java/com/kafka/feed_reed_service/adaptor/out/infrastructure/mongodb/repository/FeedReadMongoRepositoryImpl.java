package com.kafka.feed_reed_service.adaptor.out.infrastructure.mongodb.repository;

import com.kafka.feed_reed_service.application.port.out.FeedReadRepositoryPort;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

@Repository
@RequiredArgsConstructor
public class FeedReadMongoRepositoryImpl implements FeedReadRepositoryPort {

    private final FeedReadMongoRepository feedReadMongoRepository;

    @Override
    public void saveFeedRead(FeedReadSaveDto feedReadSaveDto) {
        feedReadMongoRepositoryl.save();
    }
}
