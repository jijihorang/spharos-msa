package com.spharos_msa.chatservice.application.port.out;

import reactor.core.publisher.Flux;

public interface ChatServiceReactiveRepositoryPort {

    // Reactive : Get 방식
    Flux<ChatMessageGetDto> getChatByChatRoomUuid(String chatRoomUuid);
}


