package com.spharos_msa.chatservice.adaptor.out.mongodb.entity;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@ToString
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Document
public class ChatRoomEntity {

    @Id
    private String id;

    private String roomName;

    private List<ParticipantEntity> participants;
}
