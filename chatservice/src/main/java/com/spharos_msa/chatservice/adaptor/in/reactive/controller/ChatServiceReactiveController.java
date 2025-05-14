package com.spharos_msa.chatservice.adaptor.in.reactive.controller;

import com.spharos_msa.chatservice.adaptor.in.reactive.mapper.ChatMessageFluxMapper;
import com.spharos_msa.chatservice.adaptor.in.reactive.vo.ChatMessageResponseVo;
import com.spharos_msa.chatservice.application.port.in.ChatServiceReactiveUseCase;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.scheduler.Schedulers;

@Slf4j
@RestController
@RequiredArgsConstructor
@CrossOrigin(origins = "*")
@RequestMapping("/api/v1/chat/reactive")
public class ChatServiceReactiveController {

    private final ChatServiceReactiveUseCase chatServiceReactiveUseCase;

    private final ChatMessageFluxMapper chatMessageFluxMapper;

    @GetMapping(value = "/{chatRoomUuid}", produces = MediaType.TEXT_EVENT_STREAM_VALUE)
    public Flux<ChatMessageResponseVo> getChatByChatRoomUuid(@PathVariable String chatRoomUuid) {
        return chatMessageFluxMapper.toVo(chatServiceReactiveUseCase.getChatByChatRoomByUuid(chatRoomUuid).subscribeOn(Schedulers.boundedElastic())); // Flux 형태로 감싸야 함

    }
}
