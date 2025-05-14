package com.spharos_msa.chatservice.adaptor.out.mongodb.entity;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@ToString
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Document
public class ParticipantEntity {

    @Id
    private String id;

    private Integer unreadCount;
}
