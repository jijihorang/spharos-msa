package com.kafka.feed_reed_service.adaptor.out.infrastructure.mongodb.entity;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.Instant;
import java.util.List;

@Getter
@NoArgsConstructor
@Document (collection = "feed_read")
public class FeedReadMongoEntity {

    @Id
    private String id;

    private String feedUuid;

    private String title;

    private String content;

    private String authorId;

    private String authorNickname;

    private String authorProfileImageUrl;

    @CreatedDate
    private Instant createdAt;

    @LastModifiedDate
    private Instant updatedAt;

    private List<FeedReadImageMongoEntity> feedImages;

    @Builder
    public FeedReadMongoEntity(String id, String feedUuid, String title, String content,
                               String authorId, String authorNickname, String authorProfileImageUrl,
                               Instant createdAt, Instant updatedAt, List<FeedReadImageMongoEntity> feedImages) {
        this.id = id;
        this.feedUuid = feedUuid;
        this.title = title;
        this.content = content;
        this.authorId = authorId;
        this.authorNickname = authorNickname;
        this.authorProfileImageUrl = authorProfileImageUrl;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
        this.feedImages = feedImages;
    }
}
