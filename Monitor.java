class MyTest {
    void display(String str) {
        for (int i = 0; i < str.length(); i++) {
            System.out.print(str.charAt(i));
        }
    }
}

class MyThread1 extends Thread {

    MyTest t;

    public MyThread1(MyTest t) {
        this.t = t;
    }

    public void run() {
        t.display("Hello World");
    }
}

class MyThread2 extends Thread {

    MyTest t;

    public MyThread2(MyTest t) {
        this.t = t;
    }

    public void run() {
        t.display("Welcome World");
    }
}

public class Monitor {
    public static void main(String[] args) {
        MyTest t = new MyTest();
        MyThread1 t1 = new MyThread1(t);
        MyThread2 t2 = new MyThread2(t);
        t1.start();
        t2.start();
    }
}