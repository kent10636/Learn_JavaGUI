public class RunThreads implements Runnable {
    public static void main(String[] args) {
        //创建Runnable实例
        RunThreads runner = new RunThreads();

        //创建两个线程，使用相同的Runnable（相同的任务）
        Thread alpha = new Thread(runner);
        Thread beta = new Thread(runner);

        //给线程取名
        alpha.setName("Alpha thread");
        beta.setName("Beta thread");

        //启动线程
        alpha.start();
        beta.start();
    }

    @Override
    public void run() {
        for (int i = 0; i < 25; i++) {
            String threadName = Thread.currentThread().getName();
            System.out.println(threadName + " is running");
        }
    }
}
