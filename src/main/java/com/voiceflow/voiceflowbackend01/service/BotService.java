package com.voiceflow.voiceflowbackend01.service;

import com.voiceflow.voiceflowbackend01.model.Bot;
import com.voiceflow.voiceflowbackend01.repository.BotRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BotService {

    private final BotRepository botRepository;

    public BotService(BotRepository botRepository) {
        this.botRepository = botRepository;
    }

    public Bot createBot(Bot bot) {
        return botRepository.save(bot);
    }

    public List<Bot> getBots(String userId) {
        return botRepository.findByUserId(userId);
    }
}
