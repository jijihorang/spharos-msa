package com.kafka.feed_service.application.mapper;

import com.kafka.feed_service.application.dto.FeedDto;
import com.kafka.feed_service.application.dto.FeedResponseDto;
import com.kafka.feed_service.domain.moodel.FeedDomainModel;
import org.springframework.stereotype.Component;

@Component
public class FeedDtoMapper {

    public FeedResponseDto toResponseDto(FeedDomainModel feedDomainModel) {
        return FeedResponseDto.builder()
                .feedUuid(feedDomainModel.getFeedUuid())
                .title(feedDomainModel.getTitle())
                .content(feedDomainModel.getContent())
                .authorId(feedDomainModel.getAuthorId())
                .isDeleted(feedDomainModel.isDeleted())
                .createdAt(feedDomainModel.getCreatedAt())
                .updatedAt(feedDomainModel.getUpdatedAt())
                .build();
    }

    public FeedDomainModel toDomainModel(FeedDto feedDto) {
        return FeedDomainModel.builder()
                .feedUuid(feedDto.getFeedUuid())
                .title(feedDto.getTitle())
                .content(feedDto.getContent())
                .authorId(feedDto.getAuthorId())
                .isDeleted(feedDto.isDeleted())
                .createdAt(feedDto.getCreatedAt())
                .updatedAt(feedDto.getUpdatedAt())
                .build();
    }

    public FeedDto toDto(FeedDomainModel feedDomainModel) {
        return FeedDto.builder()
                .feedUuid(feedDomainModel.getFeedUuid())
                .title(feedDomainModel.getTitle())
                .content(feedDomainModel.getContent())
                .authorId(feedDomainModel.getAuthorId())
                .isDeleted(feedDomainModel.isDeleted())
                .createdAt(feedDomainModel.getCreatedAt())
                .updatedAt(feedDomainModel.getUpdatedAt())
                .build();
    }
}
