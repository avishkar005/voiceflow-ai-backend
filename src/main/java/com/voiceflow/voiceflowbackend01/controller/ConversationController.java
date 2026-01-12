package com.voiceflow.voiceflowbackend01.controller;
import com.voiceflow.voiceflowbackend01.model.Conversation;
import com.voiceflow.voiceflowbackend01.service.ConversationService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/conversations")
@CrossOrigin
public class ConversationController {

    private final ConversationService service;

    public ConversationController(ConversationService service) {
        this.service = service;
    }

    @PostMapping
    public Conversation save(@RequestBody Conversation convo) {
        return service.saveConversation(convo);
    }

    @GetMapping("/{botId}")
    public List<Conversation> get(@PathVariable String botId) {
        return service.getByBot(botId);
    }
}