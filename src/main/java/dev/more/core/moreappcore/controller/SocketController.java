package dev.more.core.moreappcore.controller;

import com.google.gson.Gson;
import dev.more.core.moreappcore.CreateRoom;
import dev.more.core.moreappcore.service.ChatRoomService;
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


    @MessageMapping("/create-chat")
    public void createRoom(String json) {
        CreateRoom room = new Gson().fromJson(json, CreateRoom.class);
        
    }


}

