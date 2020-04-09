package dev.more.core.moreappcore;

import org.hibernate.annotations.CreationTimestamp;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
public class CreateRoom {
    @ElementCollection
    List<Long> memberList = new ArrayList<>();
    Message message;
    @CreationTimestamp
    private Date roomUid;

    public CreateRoom(List<Long> memberList) {
        this.memberList = memberList;
    }

    public List<Long> getMemberList() {
        return memberList;
    }

    public void setMemberList(List<Long> memberList) {
        this.memberList = memberList;
    }

    public Message getMessage() {
        return message;
    }

    public void setMessage(Message message) {
        this.message = message;
    }

    public Date getRoomUid() {
        return roomUid;
    }

    public void setRoomUid(Date roomUid) {
        this.roomUid = roomUid;
    }
}
