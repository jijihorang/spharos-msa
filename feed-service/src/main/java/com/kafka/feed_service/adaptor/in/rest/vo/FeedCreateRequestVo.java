package com.kafka.feed_service.adaptor.in.rest.vo;

import lombok.Getter;

@Getter
public class FeedCreateRequestVo {

    private String title;

    private String content;

    private String authorId;
}
