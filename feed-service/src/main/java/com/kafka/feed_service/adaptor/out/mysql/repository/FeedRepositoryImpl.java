package com.kafka.feed_service.adaptor.out.mysql.repository;

import com.kafka.feed_service.adaptor.out.mysql.mapper.FeedEntityMapper;
import com.kafka.feed_service.application.dto.FeedDto;
import com.kafka.feed_service.application.dto.FeedResponseDto;
import com.kafka.feed_service.application.port.out.FeedRepositoryPort;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@RequiredArgsConstructor
public class FeedRepositoryImpl implements FeedRepositoryPort {

    private final FeedJpaRepository feedJpaRepository;
    private final FeedEntityMapper feedEntityMapper;

    @Override
    public void save(FeedDto feedDto) {
        feedJpaRepository.save(feedEntityMapper.toFeedEntity(feedDto));
    }

    @Override
    public void update(FeedDto feedDto) {

    }

    @Override
    public FeedDto findByFeedUuid(String feedUuid) {
        return feedEntityMapper.toFeedDto(feedJpaRepository.findByFeedUuid(feedUuid).orElseThrow(
                () -> new RuntimeException("Feed not found")
        ));
    }

    @Override
    public List<FeedResponseDto> findByAuthorId(String authorId) {
        return List.of();
    }

    @Override
    public void deleteByFeedUuid(String feedUuid) {

    }
}
