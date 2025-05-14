package com.spharos_msa.chatservice.adaptor.out.mongodb.reactiveRepository;

import com.mongodb.client.model.changestream.OperationType;
import com.spharos_msa.chatservice.adaptor.out.mongodb.entity.ChatMessageEntity;
import com.spharos_msa.chatservice.application.port.out.ChatServiceReactiveRepositoryPort;
import lombok.RequiredArgsConstructor;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.core.ChangeStreamEvent;
import org.springframework.data.mongodb.core.ChangeStreamOptions;
import org.springframework.data.mongodb.core.ReactiveMongoTemplate;
import org.springframework.data.mongodb.core.aggregation.Aggregation;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.stereotype.Repository;
import reactor.core.publisher.Flux;

// 구현체
@Repository
@RequiredArgsConstructor
public class ChatReactiveRepositoryImpl implements ChatServiceReactiveRepositoryPort {

    private final ChatServiceReactiveMongoRepository chatServiceReactiveMongoRepository;

    private final ReactiveMongoTemplate reactiveMongoTemplate;

    @Override
    public Flux<ChatMessageGetDto> getChatByChatRoomUuid(String chatRoomUuid) {

//        ChangeStreamOptions options = ChangeStreamOptions.builder()
//                .filter(Aggregation.newAggregation(
//                        Aggregation.match(Criteria.where("operationType").is(OperationType.INSERT.getValue())),
//                        Aggregation.match(Criteria.where("fullDocument.chatRoomUuid").is(chatRoomUuid))
//                ))
//                .build();
//
//        reactiveMongoTemplate.changeStream("chat_message_entity", options, Document.class)
//                .map(ChangeStreamEvent::getBody)
//                .map(document -> ChatMessageEntity.builder()
//                        .id(document.getClass("_id", ObjectId.class).toString())
//                        .chatRoomUuid(document.getClass("chatRoomUuid"))
//                        .senderId(document.getClass("senderId"))
//                        .
//                )

        return chatServiceReactiveMongoRepository.findByChatRoomUuid(chatRoomUuid);
    }
}
