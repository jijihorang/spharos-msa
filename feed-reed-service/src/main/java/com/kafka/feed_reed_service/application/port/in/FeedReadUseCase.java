package com.kafka.feed_reed_service.application.port.in;

public interface FeedReadUseCase {

    void createFeedRead(FeedCreateEventDto feedCreateEventDto);
}
