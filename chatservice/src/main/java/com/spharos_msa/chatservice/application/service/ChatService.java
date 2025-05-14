package com.spharos_msa.chatservice.application.service;

import com.spharos_msa.chatservice.application.port.dto.ChatMessageResponseDto;
import com.spharos_msa.chatservice.application.port.in.ChatServiceUseCase;

import java.util.List;

public class ChatService implements ChatServiceUseCase {

    @Override
    public void sendChatMessage(ChatMessageRequestDto chatMessageRequestDto) {

    }

    @Override
    public ChatRoomResponseDto createChatRoom(CreateChatRoomRequestDto createChatRoomRequestDto) {
        return null;
    }

    @Override
    public List<ChatMessageResponseDto> getChatByRoom(String chatRoomUuid) {
        return List.of();
    }
}
