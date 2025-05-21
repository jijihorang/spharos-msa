package com.kafka.feed_service.adaptor.in.rest.mapper;

import com.kafka.feed_service.adaptor.in.rest.vo.FeedCreateRequestVo;
import com.kafka.feed_service.adaptor.in.rest.vo.FeedResponseVo;
import com.kafka.feed_service.application.dto.FeedCreateRequestDto;
import com.kafka.feed_service.application.dto.FeedResponseDto;
import org.springframework.stereotype.Component;

@Component
public class FeedVoMapper {

    public FeedResponseVo toResponseVo(FeedResponseDto responseDto) {
        return FeedResponseVo.builder()
                .feedUuid(responseDto.getFeedUuid())
                .title(responseDto.getTitle())
                .content(responseDto.getContent())
                .authorId(responseDto.getAuthorId())
                .createdAt(responseDto.getCreatedAt())
                .updatedAt(responseDto.getUpdatedAt())
                .build();
    }

    public FeedCreateRequestDto toRequestDto(FeedCreateRequestVo feedCreateRequestVo) {
        return FeedCreateRequestDto.builder()
                .title(feedCreateRequestVo.getTitle())
                .content(feedCreateRequestVo.getContent())
                .authorId(feedCreateRequestVo.getAuthorId())
                .build();
    }
}
