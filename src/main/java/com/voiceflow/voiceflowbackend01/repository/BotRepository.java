package com.voiceflow.voiceflowbackend01.repository;

import com.voiceflow.voiceflowbackend01.model.Bot;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface BotRepository extends MongoRepository<Bot, String> {
    List<Bot> findByUserId(String userId);
}
