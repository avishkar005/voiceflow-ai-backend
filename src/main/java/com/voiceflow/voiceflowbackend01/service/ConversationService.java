package com.voiceflow.voiceflowbackend01.service;

import com.voiceflow.voiceflowbackend01.model.Conversation;
import com.voiceflow.voiceflowbackend01.repository.ConversationRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ConversationService {
    private final ConversationRepository repo;

    public ConversationService(ConversationRepository repo) {
        this.repo = repo;
    }

    public Conversation saveConversation(Conversation convo) {
        return repo.save(convo);
    }

    public List<Conversation> getByBot(String botId) {
        return repo.findByBotId(botId);
    }
}