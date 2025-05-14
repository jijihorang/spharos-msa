package com.spharos_msa.chatservice.domain.model;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public class ChatMessage {

    private String chatMessageUuid;

    private String chatRoomUuid;

    private String messageType;

    private String senderUuid;

    private String createdAt;

    private String updatedAt;

    @Builder
    public ChatMessage(String chatMessageUuid, String chatRoomUuid, String messageType,
                       String senderUuid, String createdAt, String updatedAt) {
        this.chatMessageUuid = chatMessageUuid;
        this.chatRoomUuid = chatRoomUuid;
        this.messageType = messageType;
        this.senderUuid = senderUuid;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
    }
}
