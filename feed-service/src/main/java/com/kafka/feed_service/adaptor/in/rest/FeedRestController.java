package com.kafka.feed_service.adaptor.in.rest;

import com.kafka.feed_service.adaptor.in.rest.mapper.FeedVoMapper;
import com.kafka.feed_service.adaptor.in.rest.vo.FeedCreateRequestVo;
import com.kafka.feed_service.adaptor.in.rest.vo.FeedResponseVo;
import com.kafka.feed_service.application.port.in.FeedUseCase;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@Slf4j
@RestController
@RequestMapping("/api/v1/feeds")
@RequiredArgsConstructor
public class FeedRestController {

    private final FeedUseCase feedUseCase;
    private final FeedVoMapper feedVoMapper;

    // 추후 ResponseEntity 사용
    @PostMapping("/add")
    public ResponseEntity<String> createFeed(
            @RequestBody FeedCreateRequestVo feedCreateRequestVo
    ) {
        feedUseCase.createFeed(feedVoMapper.toRequestDto(feedCreateRequestVo));

        return ResponseEntity.ok("Successfully created feed");
    }

    @GetMapping("/get-feed/{feedUuid}")
    public ResponseEntity<FeedResponseVo> getFeed(
            @PathVariable String feedUuid
    ) {
        FeedResponseVo getResponseVo = feedVoMapper.toResponseVo(feedUseCase.getFeedByFeedUuid(feedUuid));

        return ResponseEntity.ok(getResponseVo);
    }
}
