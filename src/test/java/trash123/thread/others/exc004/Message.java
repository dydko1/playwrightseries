package trash123.thread.others.exc004;

import static java.lang.Thread.sleep;

class Message {
    String msg = "shared resource";

    public Message(String msg) {
        this.msg = msg;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}