package com.kafka.feed_service.application.dto;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public class FeedCreateRequestDto {

    private String title;

    private String content;

    private String authorId;

    @Builder
    public FeedCreateRequestDto(String title, String content, String authorId) {
        this.title = title;
        this.content = content;
        this.authorId = authorId;
    }
}
