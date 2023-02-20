package co.develhope.websocket2.controller;

import co.develhope.websocket2.entities.ClientMessageDTO;
import co.develhope.websocket2.entities.MessageDTO;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;

@Controller
public class NotificationController{

    @MessageMapping("/broadcast-message")
    @SendTo("/topic/broadcast")
    public MessageDTO broadcastMessage(MessageDTO message) {
        System.out.println(message.toString());
        return new MessageDTO();
    }

    @MessageMapping("/client-message")
    @SendTo("/topic/broadcast")
    public ClientMessageDTO clientMessage(ClientMessageDTO message) {
        System.out.println(message.toString());
        return new ClientMessageDTO();
    }
}
