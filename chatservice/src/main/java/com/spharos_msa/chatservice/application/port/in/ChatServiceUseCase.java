package com.spharos_msa.chatservice.application.port.in;

import com.spharos_msa.chatservice.application.port.dto.ChatMessageResponseDto;
import com.spharos_msa.chatservice.domain.model.ChatRoom;

import java.util.List;

public interface ChatServiceUseCase {

    // 클라이언트에서 보낸 채팅 메시지를 저장 또는 전송하는 역할
    void sendChatMessage(ChatMessageRequestDto chatMessageRequestDto);

    // 새로운 채팅방을 생성하고, 참여자 정보를 등록하는 메서드
    ChatRoomResponseDto createChatRoom(CreateChatRoomRequestDto createChatRoomRequestDto);

    // 특정 채팅방에 해당하는 기존 메시지 목록을 조회
    List<ChatMessageResponseDto> getChatByRoom(String chatRoomUuid);

}
