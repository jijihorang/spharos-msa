package com.spharos_msa.chatservice.adaptor.out.mongodb.reactiveRepository;

import com.spharos_msa.chatservice.adaptor.out.mongodb.entity.ChatMessageEntity;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.data.mongodb.repository.Tailable;
import org.springframework.stereotype.Repository;
import reactor.core.publisher.Flux;

@Repository
public interface ChatServiceReactiveMongoRepository extends ReactiveMongoRepository<ChatMessageEntity, String> {

    @Tailable
    @Query("{ 'chatRoomUuid' :  ?0 }")
    Flux<ChatMessageEntity> findByChatRoomUuid(String chatRoomUuid);
}
