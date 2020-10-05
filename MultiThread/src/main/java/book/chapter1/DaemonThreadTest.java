package book.chapter1;

/**
 * 用户线程和守护线程的区别
 *
 * @auther willi
 * @create-time 2019-05-28-19:15
 */


public class DaemonThreadTest {
    public static void main(String[] args) {
        Thread thread = new Thread(() -> {
            for(;;){
                  System.out.println("Hello");
            }

        });

        //设置为守护线程
        thread.setDaemon(true);

        //启动子线程
        thread.start();

        System.out.println("main thread is over");
    }
}
