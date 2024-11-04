package trash123.thread.others.exc004;

class ThreadOne extends Thread {
    Message msg;

    public ThreadOne(Message msg) {
        this.msg = msg;
    }

    @Override
    public void run() {
        System.out.println("Thread started running - " + currentThread().getName());
        synchronized (msg) {
            try {
                msg.setMsg("Message from thread 1");
                currentThread().suspend();
                System.out.println("Thread one resumed, wait called ");
                msg.wait();

            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        System.out.println("Thread one executed");

    }
}