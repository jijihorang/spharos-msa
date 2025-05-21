package com.kafka.feed_service.domain.service;

import com.kafka.feed_service.domain.moodel.FeedDomainModel;

public class FeedDomainService {

    // 정해진 형태로 받아야 하는 경우가 있다 > title, authorId, content 필수 값이라면 추가적인 서비스가 필요함 (validate 체크)
    public Boolean isFeedValid(String title, String content, String authorId) {
        return title != null && !title.isEmpty() && content != null && !content.isEmpty() && authorId != null && !authorId.isEmpty();
    }

    public void updateFeed(FeedDomainModel feed, String newTitle, String newContent) {
        feed.update(newTitle, newContent);
    }
}
