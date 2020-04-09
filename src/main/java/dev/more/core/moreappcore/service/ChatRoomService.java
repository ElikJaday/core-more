package dev.more.core.moreappcore.service;

import dev.more.core.moreappcore.entity.ChatRoomEntity;
import dev.more.core.moreappcore.repository.ChatRoomRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ChatRoomService {

    @Autowired
    private ChatRoomRepository chatRoomRepository;

    public ChatRoomEntity createRoom(){
        ChatRoomEntity chatRoomEntity = new ChatRoomEntity();
        ChatRoomEntity createdRoom =  chatRoomRepository.save(chatRoomEntity);
        return createdRoom;
    }

    public void addMemberInRoom(){

    }

    public void deleteMemberFromRoom(){

    }

    public void deleteRoom(){

    }


}
