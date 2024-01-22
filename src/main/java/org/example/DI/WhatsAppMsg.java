package org.example.DI;

import org.springframework.stereotype.Service;

@Service
public class WhatsAppMsg implements SendMessageService {
    @Override
    public void sendMessage(String message) {
        System.out.println("whatsapp message: " + message);
    }
}

