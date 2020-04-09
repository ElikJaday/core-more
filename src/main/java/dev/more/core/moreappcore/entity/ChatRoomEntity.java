package dev.more.core.moreappcore.entity;

import org.hibernate.annotations.CreationTimestamp;
import javax.persistence.*;
import java.util.Date;
import java.util.LinkedHashSet;
import java.util.Set;

@Entity
@Table(name = "Chat_room_entity")
public class ChatRoomEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long roomId;
    @ElementCollection
    private Set<String> listMemberId = new LinkedHashSet<>();
    @CreationTimestamp
    private Date uid;

    public ChatRoomEntity() {
    }

    public Long getRoomId() {
        return roomId;
    }

    public void setRoomId(Long roomId) {
        this.roomId = roomId;
    }

    public Set<String> getListMemberId() {
        return listMemberId;
    }

    public void setListMemberId(Set<String> listMemberId) {
        this.listMemberId = listMemberId;
    }

    public Date getUid() {
        return uid;
    }

    public void setUid(Date uid) {
        this.uid = uid;
    }

}
