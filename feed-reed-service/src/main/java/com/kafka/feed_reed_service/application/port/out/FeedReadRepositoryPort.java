package com.kafka.feed_reed_service.application.port.out;

public interface FeedReadRepositoryPort {

    void saveFeedRead(FeedReadSaveDto feedReadSaveDto);
}
