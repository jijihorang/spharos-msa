package com.kafka.feed_service.application.service;

import com.kafka.feed_service.application.dto.FeedCreateRequestDto;
import com.kafka.feed_service.application.dto.FeedResponseDto;
import com.kafka.feed_service.application.dto.FeedUpdateRequestDto;
import com.kafka.feed_service.application.port.in.FeedUseCase;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@Slf4j
@Service
public class FeedService implements FeedUseCase {

    @Override
    public void createFeed(FeedCreateRequestDto feedCreateRequestDto) {

    }

    @Override
    public void updateFeed(FeedUpdateRequestDto feedUpdateRequestDto) {

    }

    @Override
    public FeedResponseDto getFeedByFeedUuid(String feedUuid) {
        return null;
    }

    @Override
    public List<FeedResponseDto> getFeedByAuthorId(String authorId) {
        return List.of();
    }

    @Override
    public void deleteFeed(String feedUuid) {

    }
}
