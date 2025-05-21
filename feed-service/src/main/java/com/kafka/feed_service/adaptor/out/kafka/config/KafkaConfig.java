package com.kafka.feed_service.adaptor.out.kafka.config;

import com.kafka.feed_service.adaptor.out.kafka.event.FeedEvent;
import org.apache.kafka.clients.producer.ProducerConfig;
import org.apache.kafka.common.serialization.StringSerializer;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.annotation.EnableKafka;
import org.springframework.kafka.core.DefaultKafkaProducerFactory;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.kafka.core.ProducerFactory;
import org.springframework.kafka.support.serializer.JsonSerializer;

import java.util.HashMap;
import java.util.Map;

@EnableKafka
@Configuration
public class KafkaConfig {

    @Value("${spring.kafka.bootstrap-servers}")
    private String bootstrapServer;

    public Map<String, Object> feedProducerConfigs() {
        Map<String, Object> props = new HashMap<>();

        props.put(ProducerConfig.BOOTSTRAP_SERVERS_CONFIG, bootstrapServer);
        props.put(ProducerConfig.KEY_SERIALIZER_CLASS_CONFIG, StringSerializer.class);
        props.put(ProducerConfig.VALUE_SERIALIZER_CLASS_CONFIG, JsonSerializer.class);

        return props;
    }

    // 팩토리
    @Bean
    public ProducerFactory<String, FeedEvent> createFeedNotification() {
        return new DefaultKafkaProducerFactory<>(feedProducerConfigs());
    }

    // 템플릿
    @Bean
    public KafkaTemplate<String, FeedEvent> kafkaTemplate() {
        return new KafkaTemplate<>(createFeedNotification());
    }
}
