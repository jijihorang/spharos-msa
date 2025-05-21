package com.kafka.feed_service.application.dto;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Getter
@NoArgsConstructor
public class FeedDto {

    private Long id;

    private String feedUuid;

    private String title;

    private String content;

    private String authorId;

    private boolean isDeleted;

    private LocalDateTime createdAt;

    private LocalDateTime updatedAt;

    @Builder
    public FeedDto(Long id, String feedUuid, String title, String content, String authorId,
                   boolean isDeleted, LocalDateTime createdAt, LocalDateTime updatedAt) {
        this.id = id;
        this.feedUuid = feedUuid;
        this.title = title;
        this.content = content;
        this.authorId = authorId;
        this.isDeleted = isDeleted;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
    }
}
