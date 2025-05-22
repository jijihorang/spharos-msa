package com.kafka.feed_reed_service.domain.model;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.List;

@Getter
@NoArgsConstructor
public class FeedReadDomain {

    private String id;

    private String feedUuid;

    private String title;

    private String content;

    private String authorId;

    private String authorNickname;

    private String authorProfileImageUrl;

    private String createdAt;

    private String updatedAt;

    private List<FeedReadImageDomain> feedImages;

    @Builder
    public FeedReadDomain(String id, String feedUuid, String title, String content,
                          String authorId, String authorNickname, String authorProfileImageUrl,
                          String createdAt, String updatedAt,
                          List<FeedReadImageDomain> feedImages) {
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
