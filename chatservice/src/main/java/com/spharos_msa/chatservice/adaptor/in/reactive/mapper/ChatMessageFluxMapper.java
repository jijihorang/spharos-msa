package com.spharos_msa.chatservice.adaptor.in.reactive.mapper;

import com.spharos_msa.chatservice.adaptor.in.reactive.vo.ChatMessageResponseVo;
import com.spharos_msa.chatservice.application.port.dto.ChatMessageResponseDto;
import org.springframework.stereotype.Component;
import reactor.core.publisher.Flux;

@Component
public class ChatMessageFluxMapper {

    public Flux<ChatMessageResponseVo> toVo(Flux<ChatMessageResponseDto> chatMessageResponseDtoFlux) {
        return chatMessageResponseDtoFlux.map(chatMessageResponseDto -> ChatMessageResponseVo.builder()
                .chatUuid(chatMessageResponseDto.getChatUuid())
                .chatRoomUuid(chatMessageResponseDto.getChatRoomUuid())
                .messageType(chatMessageResponseDto.getMessageType())
                .message(chatMessageResponseDto.getMessage())
                .senderId(chatMessageResponseDto.getSenderId())
                .createdAt(chatMessageResponseDto.getCreatedAt())
                .updatedAt(chatMessageResponseDto.getUpdatedAt())
                .build());
    }
}
