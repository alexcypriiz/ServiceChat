package ru.podlubnyy.chat.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import ru.podlubnyy.chat.domain.Message;
import ru.podlubnyy.chat.repository.MessageRepository;

import java.util.Map;

/**
 * Created by Alexey Podlubnyy on 01.08.2021
 */

@Controller
public class MainController {

    @Autowired
    private MessageRepository messageRepository;

    @GetMapping
    public String main(Map<String, Object> model) {
        Iterable<Message> messages = messageRepository.findAll();

        model.put("messages", messages);

        return "mainChat";
    }

    @PostMapping
    public String add(@RequestParam String text, Map<String, Object> model) {
        Message message = new Message(text);
        messageRepository.save(message);

        Iterable<Message> messages = messageRepository.findAll();
        model.put("messages", messages);

        return "mainChat";
    }

}
