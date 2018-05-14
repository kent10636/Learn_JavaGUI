public class MyRunnable implements Runnable {
    public void run() {
        go();
    }

    public void go() {
        doMore();
    }

    public void doMore() {
        System.out.println("top o' the stack");
    }
}

class ThreadTester {
    public static void main(String[] args) {
        Runnable threadJob = new MyRunnable();
        Thread myThread = new Thread(threadJob);  //将Runnable的实例传给Thread的构造函数

        myThread.start();

        System.out.println("back in main");
    }
}
