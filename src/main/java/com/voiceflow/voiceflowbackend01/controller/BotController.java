package com.voiceflow.voiceflowbackend01.controller;

import com.voiceflow.voiceflowbackend01.model.Bot;
import com.voiceflow.voiceflowbackend01.service.BotService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/bots")
@CrossOrigin(origins = "http://localhost:5184")
public class BotController {

    private final BotService botService;

    public BotController(BotService botService) {
        this.botService = botService;
    }

    // ✅ GET all bots by user
    @GetMapping("/{userId}")
    public List<Bot> getBots(@PathVariable String userId) {
        return botService.getBots(userId);
    }

    // ✅ CREATE bot
    @PostMapping
    public Bot createBot(@RequestBody Bot bot) {
        if (bot.getUserId() == null || bot.getUserId().isEmpty()) {
            throw new RuntimeException("UserId is required");
        }
        return botService.createBot(bot);
    }
}
