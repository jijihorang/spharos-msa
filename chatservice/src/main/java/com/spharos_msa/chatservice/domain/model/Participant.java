package com.spharos_msa.chatservice.domain.model;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public class Participant {

    private String userUuid;

    private Integer unreadCount;

    @Builder
    public Participant(String userUuid, Integer unreadCount) {
        this.userUuid = userUuid;
        this.unreadCount = unreadCount;
    }
}
