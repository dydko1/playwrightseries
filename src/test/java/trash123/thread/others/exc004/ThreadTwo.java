package trash123.thread.others.exc004;

class ThreadTwo extends Thread {
    Message msg;

    public ThreadTwo(Message msg) {
        this.msg = msg;
    }

    @Override
    public void run() {
        System.out.println("Thread started running - " + currentThread().getName());
        synchronized (msg) {
            msg.setMsg("Message from thread 2");
            msg.notify();
        }
        System.out.println("Thread 2 executed, Notify called");

    }
}