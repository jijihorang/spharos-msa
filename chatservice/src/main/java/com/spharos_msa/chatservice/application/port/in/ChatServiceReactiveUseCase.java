package com.spharos_msa.chatservice.application.port.in;

import com.spharos_msa.chatservice.application.port.dto.ChatMessageResponseDto;
import reactor.core.publisher.Flux;

public interface ChatServiceReactiveUseCase {

    // 채팅방 UUID 기반으로 해당 채팅방의 메시지를 비동기 스트림으로 가져온다
    Flux<ChatMessageResponseDto> getChatByChatRoomByUuid(String chatRoomUuid);
}
