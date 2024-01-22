package org.example.DI;

public class FaceBookMsg implements SendMessageService {
    @Override
    public void sendMessage(String message) {
        System.out.println("facebook message : " + message);
    }
}