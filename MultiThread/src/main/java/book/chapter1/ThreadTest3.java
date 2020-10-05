package book.chapter1;

public class ThreadTest3 {
    public static void main(String[] args) {
        Runnable runnable = () -> System.out.println("Hello world!");
        new Thread(runnable).start();
    }
}
