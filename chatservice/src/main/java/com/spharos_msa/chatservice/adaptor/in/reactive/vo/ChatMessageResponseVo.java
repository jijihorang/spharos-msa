package com.spharos_msa.chatservice.adaptor.in.reactive.vo;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public class ChatMessageResponseVo {

    private String chatUuid;
    private String chatRoomUuid;
    private String messageType;
    private String message;
    private String senderId;
    private String createdAt;
    private String updatedAt;

    @Builder
    public ChatMessageResponseVo(String chatUuid, String chatRoomUuid, String messageType, String message,
                                 String senderId, String createdAt, String updatedAt) {
        this.chatUuid = chatUuid;
        this.chatRoomUuid = chatRoomUuid;
        this.messageType = messageType;
        this.message = message;
        this.senderId = senderId;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
    }
}
