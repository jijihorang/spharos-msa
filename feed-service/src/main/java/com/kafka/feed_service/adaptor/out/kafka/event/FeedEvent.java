package com.kafka.feed_service.adaptor.out.kafka.event;

import lombok.*;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class FeedEvent {

    private String feedUuid;

    private String title;

    private String content;

    private String authorId;
}
