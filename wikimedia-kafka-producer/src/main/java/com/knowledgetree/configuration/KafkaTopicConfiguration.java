package com.knowledgetree.configuration;

import static com.knowledgetree.util.WikimediaConstants.WIKIMEDIA_TOPIC;

import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.config.TopicBuilder;

@Configuration
public class KafkaTopicConfiguration {

  @Bean
  public NewTopic kafkaTopic() {
    return TopicBuilder.name(WIKIMEDIA_TOPIC).build();
  }
}
