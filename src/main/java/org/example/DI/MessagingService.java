package org.example.DI;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MessagingService {
    private final SendMessageService sendMessageService;

    @Autowired
    public MessagingService(SendMessageService sendMessageService) {
        this.sendMessageService = sendMessageService;
    }

    public void sendNotification(String message){
        this.sendMessageService.sendMessage(message);
    }
}
