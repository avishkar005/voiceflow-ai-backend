package com.voiceflow.voiceflowbackend01.repository;

import com.voiceflow.voiceflowbackend01.model.Conversation;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface ConversationRepository extends MongoRepository<Conversation, String> {

    List<Conversation> findByBotId(String botId);
}
