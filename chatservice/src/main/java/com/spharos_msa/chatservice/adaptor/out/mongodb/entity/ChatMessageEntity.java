package com.spharos_msa.chatservice.adaptor.out.mongodb.entity;

import lombok.*;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.Instant;

@ToString
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Document
public class ChatMessageEntity {

    @Id
    private String id;

    private String chatRoomUuid;

    private String messageType;

    private String message;

    @CreatedDate
    private Instant createdAt;

    @LastModifiedDate
    private Instant updatedAt;
}
