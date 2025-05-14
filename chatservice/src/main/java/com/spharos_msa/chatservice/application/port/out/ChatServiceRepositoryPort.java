package com.spharos_msa.chatservice.application.port.out;

public interface ChatServiceRepositoryPort {

    // 채팅방 생성
    ChatRoomFromSaveDto createChatRoom(ChatRoomToCreateDto chatRoomToCreateDto);

    // 메시지 전송
    void sendChatMessage(ChatMessageToCreateDto chatMessageToCreateDto);
}
