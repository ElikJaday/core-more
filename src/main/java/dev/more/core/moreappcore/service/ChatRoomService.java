package dev.more.core.moreappcore.service;

import dev.more.core.moreappcore.CreateRoom;
import dev.more.core.moreappcore.entity.ChatRoomEntity;
import dev.more.core.moreappcore.repository.ChatRoomRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ChatRoomService {

    @Autowired
    private ChatRoomRepository chatRoomRepository;

    public CreateRoom createRoom(CreateRoom createRoom){
        return chatRoomRepository.save(createRoom);
    }

    public void addMemberInRoom(){

    }

    public void deleteMemberFromRoom(){

    }

    public void deleteRoom(){

    }


}
