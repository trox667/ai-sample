package com.example.demo.controller;

import com.example.demo.model.Message;
import com.example.demo.service.MessageService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/messages")
public class MessageController {
    private final MessageService service;

    public MessageController(MessageService service) {
        this.service = service;
    }

    @GetMapping("/")
    public List<Message> getMessages() {
        return service.getMessages();
    }

    // TODO: DEMO - can add message
    @PostMapping("/message")
    public void addMessage(@RequestBody Message message) {
        service.addMessage(message);
    }
}
