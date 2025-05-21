package com.kafka.feed_service.application.port.out;

import com.kafka.feed_service.application.dto.FeedDto;
import com.kafka.feed_service.application.dto.FeedResponseDto;

import java.util.List;

public interface FeedRepositoryPort {

    void save(FeedDto feedDto);

    void update(FeedDto feedDto);

    FeedResponseDto findByFeedUuid(String feedUuid);

    List<FeedResponseDto> findByAuthorId(String authorId);

    void deleteByFeedUuid(String feedUuid);
}
