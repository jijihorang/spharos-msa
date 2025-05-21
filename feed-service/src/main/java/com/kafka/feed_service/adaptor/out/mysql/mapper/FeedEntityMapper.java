package com.kafka.feed_service.adaptor.out.mysql.mapper;

import com.kafka.feed_service.adaptor.out.mysql.entity.FeedEntity;
import com.kafka.feed_service.application.dto.FeedDto;
import org.springframework.stereotype.Component;

@Component
public class FeedEntityMapper {

    public FeedDto toFeedDto(FeedEntity feedEntity) {
        return FeedDto.builder()
                .id(feedEntity.getId())
                .feedUuid(feedEntity.getFeedUuid())
                .title(feedEntity.getTitle())
                .content(feedEntity.getContent())
                .authorId(feedEntity.getAuthorId())
                .isDeleted(feedEntity.isDeleted())
                .createdAt(feedEntity.getCreatedAt())
                .updatedAt(feedEntity.getUpdatedAt())
                .build();
    }

    public FeedEntity toFeedEntity(FeedDto feedDto) {
        return FeedEntity.builder()
                .feedUuid(feedDto.getFeedUuid())
                .title(feedDto.getTitle())
                .content(feedDto.getContent())
                .authorId(feedDto.getAuthorId())
                .isDeleted(feedDto.isDeleted())
                .build();
    }
}
