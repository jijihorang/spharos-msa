package com.kafka.feed_reed_service.application.service;

import com.kafka.feed_reed_service.application.port.in.FeedReadUseCase;
import com.kafka.feed_reed_service.application.port.out.FeedReadRepositoryPort;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class FeedReadService implements FeedReadUseCase {

    private final FeedReadRepositoryPort feedReadRepositoryPort;

    @Override
    public void createFeedRead(FeedCreateEventDto feedCreateEventDto) {
        feedReadRepositoryPort.saveFeedRead();
    }
}
