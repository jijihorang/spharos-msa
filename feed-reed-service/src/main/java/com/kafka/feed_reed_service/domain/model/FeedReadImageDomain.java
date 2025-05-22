package com.kafka.feed_reed_service.domain.model;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public class FeedReadImageDomain {

    private String mediaType;

    private String mediaFileUrl;

    private String mediaDescription;

    @Builder
    public FeedReadImageDomain(String mediaType, String mediaFileUrl, String mediaDescription) {
        this.mediaType = mediaType;
        this.mediaFileUrl = mediaFileUrl;
        this.mediaDescription = mediaDescription;
    }
}
