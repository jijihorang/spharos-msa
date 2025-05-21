package com.kafka.feed_service.application.port.in;

import com.kafka.feed_service.application.dto.FeedCreateRequestDto;
import com.kafka.feed_service.application.dto.FeedResponseDto;
import com.kafka.feed_service.application.dto.FeedUpdateRequestDto;

import java.util.List;

public interface FeedUseCase {

    void createFeed(FeedCreateRequestDto feedCreateRequestDto);

    void updateFeed(FeedUpdateRequestDto feedUpdateRequestDto);

    FeedResponseDto getFeedByFeedUuid(String feedUuid);

    List<FeedResponseDto> getFeedByAuthorId(String authorId);

    void deleteFeed(String feedUuid);
}
