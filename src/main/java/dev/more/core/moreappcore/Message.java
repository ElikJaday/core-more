package dev.more.core.moreappcore;


public class Message {
    private Long roomId ;
    private String msg;


    public Message(Long roomId, String msg) {
        this.roomId = roomId;
        this.msg = msg;
    }

    public Long getRoomId() {
        return roomId;
    }

    public void setRoomId(Long roomId) {
        this.roomId = roomId;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}
