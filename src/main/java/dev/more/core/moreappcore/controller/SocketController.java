package dev.more.core.moreappcore.controller;

import dev.more.core.moreappcore.service.ChatRoomService;
import dev.more.core.moreappcore.utils.JsonUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.messaging.simp.SimpMessagingTemplate;
import org.springframework.web.bind.annotation.RestController;

@RestController
class SocketController {

    @Autowired
    private SimpMessagingTemplate simpMessagingTemplate;
    @Autowired
    private ChatRoomService chatRoomService;

    @MessageMapping("/hello-msg-mapping")
    @SendTo("/topic/greetings")
    public String greeting(String name) {
        System.out.println("call");
        return name;
    }


    @MessageMapping("/create-room")
    public void createRoom(String inputMessage) {
      //  String payload = JsonUtils.toJson(chatRoomService.createRoom());
      //  simpMessagingTemplate.convertAndSend();
    }


}

