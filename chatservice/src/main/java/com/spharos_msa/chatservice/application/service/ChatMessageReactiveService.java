package com.spharos_msa.chatservice.application.service;

import com.spharos_msa.chatservice.application.port.dto.ChatMessageResponseDto;
import com.spharos_msa.chatservice.application.port.in.ChatServiceReactiveUseCase;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;

@Service
@RequiredArgsConstructor
public class ChatMessageReactiveService implements ChatServiceReactiveUseCase {

    @Override
    public Flux<ChatMessageResponseDto> getChatByChatRoomByUuid(String chatRoomUuid) {
        return null;
    }
}
