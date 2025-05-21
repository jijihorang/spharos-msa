package com.kafka.feed_service.application.service;

import com.kafka.feed_service.application.dto.FeedCreateRequestDto;
import com.kafka.feed_service.application.dto.FeedDto;
import com.kafka.feed_service.application.dto.FeedResponseDto;
import com.kafka.feed_service.application.dto.FeedUpdateRequestDto;
import com.kafka.feed_service.application.mapper.FeedDtoMapper;
import com.kafka.feed_service.application.port.in.FeedUseCase;
import com.kafka.feed_service.application.port.out.FeedRepositoryPort;
import com.kafka.feed_service.domain.moodel.FeedDomainModel;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Slf4j
@Service
@RequiredArgsConstructor
public class FeedService implements FeedUseCase {

    private final FeedRepositoryPort feedRepositoryPort;
    private final FeedDtoMapper feedDtoMapper;

    @Override
    public void createFeed(FeedCreateRequestDto feedCreateRequestDto) {

        FeedDomainModel feedDomainMode = FeedDomainModel.builder()
                .feedUuid(UUID.randomUUID().toString())
                .title(feedCreateRequestDto.getTitle())
                .content(feedCreateRequestDto.getContent())
                .authorId(feedCreateRequestDto.getAuthorId())
                .build();

        feedRepositoryPort.save(feedDtoMapper.toDto(feedDomainMode));
    }

    @Override
    public void updateFeed(FeedUpdateRequestDto feedUpdateRequestDto) {

    }

    @Override
    public FeedResponseDto getFeedByFeedUuid(String feedUuid) {

        FeedDto getFeedDto = feedRepositoryPort.findByFeedUuid(feedUuid);

        return feedDtoMapper.toResponseDto(feedDtoMapper.toDomainModel(getFeedDto));
    }

    @Override
    public List<FeedResponseDto> getFeedByAuthorId(String authorId) {
        return List.of();
    }

    @Override
    public void deleteFeed(String feedUuid) {

    }
}
