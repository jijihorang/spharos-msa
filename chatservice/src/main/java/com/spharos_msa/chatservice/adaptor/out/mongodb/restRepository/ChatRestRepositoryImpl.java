package com.spharos_msa.chatservice.adaptor.out.mongodb.restRepository;

import com.spharos_msa.chatservice.adaptor.out.mongodb.mapper.ChatEntityMapper;
import com.spharos_msa.chatservice.application.port.dto.ChatMessageSaveDto;
import com.spharos_msa.chatservice.application.port.out.ChatServiceRepositoryPort;
import lombok.RequiredArgsConstructor;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Repository;

@Repository
@RequiredArgsConstructor
public class ChatRestRepository implements ChatServiceRepositoryPort {

    private final MongoTemplate mongoTemplate;

    private final ChatEntityMapper chatEntityMapper;

    // 저징
    @Override
    public void sendChatMessage(ChatMessageSaveDto chatMessageSaveDto) {
        mongoTemplate.save(chatEntityMapper.toEntity(chatMessageSaveDto));
    }
}
