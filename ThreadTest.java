class MyThread extends Thread {
    int count = 1;

    public void run() {
        // while (true) {
        // System.err.println(count);
        // try{
        // Thread.sleep(1000);
        // }
        // catch(InterruptedException err){
        // System.err.println(err);
        // }
        // }
        System.out.println("This is start");
    }
}

public class ThreadTest {

    public static void main(String[] args) {
        MyThread t = new MyThread();
        t.start();
        System.err.println(t.getName());
        // System.err.println(t.getPriority());
        // System.err.println(t.getId());
    }
}