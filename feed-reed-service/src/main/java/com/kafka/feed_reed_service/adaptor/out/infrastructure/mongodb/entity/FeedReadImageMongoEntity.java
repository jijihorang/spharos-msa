package com.kafka.feed_reed_service.adaptor.out.infrastructure.mongodb.entity;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public class FeedReadImageMongoEntity {

    private String mediaType;

    private String mediaFileUrl;

    private String mediaDescription;

    @Builder
    public FeedReadImageMongoEntity(String mediaType, String mediaFileUrl, String mediaDescription) {
        this.mediaType = mediaType;
        this.mediaFileUrl = mediaFileUrl;
        this.mediaDescription = mediaDescription;
    }
}
