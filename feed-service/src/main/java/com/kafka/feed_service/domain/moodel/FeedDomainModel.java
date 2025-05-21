package com.kafka.feed_service.domain.moodel;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Getter
@NoArgsConstructor
public class FeedDomainModel {

    private Long id;

    private String feedUuid;

    private String title;

    private String content;

    private String authorId;

    private boolean isDeleted;

    private LocalDateTime createdAt;

    private LocalDateTime updatedAt;

    @Builder
    public FeedDomainModel(Long id, String feedUuid, String title, String content,
                           String authorId, boolean isDeleted,
                           LocalDateTime createdAt, LocalDateTime updatedAt) {
        this.id = id;
        this.feedUuid = feedUuid;
        this.title = title;
        this.content = content;
        this.authorId = authorId;
        this.isDeleted = isDeleted;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
    }

    public void update(String title, String content) {
        if (title == null || title.isEmpty()) {
            throw new IllegalArgumentException("Title cannot be null or empty");
        }

        if (content == null || content.isEmpty()) {
            throw new IllegalArgumentException("Content cannot be null or empty");
        }

        this.title = title;
        this.content = content;
    }
}
