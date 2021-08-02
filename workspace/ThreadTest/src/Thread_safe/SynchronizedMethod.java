package Thread_safe;

/**
 * 同步方法
 */
public class SynchronizedMethod {
    public static void main(String[] args) {
        // 方法一： 继承Thread
        // ThreadTest3 t3 = new ThreadTest3();
        // ThreadTest3 t4 = new ThreadTest3();

        // t3.setName("t3 ");
        // t4.setName("t4 ");

        // t3.start();
        // t4.start();

        // 方法二：实现Runnable
        ThreadTest4 ts4 = new ThreadTest4();
        Thread t5 = new Thread(ts4);
        Thread t6 = new Thread(ts4);

        t5.setName("t5 ");
        t6.setName("t6 ");

        t5.start();
        t6.start();
    }

}

class ThreadTest3 extends Thread {

    public static int target = 100;

    @Override
    public void run() {
        while (true) {
            // 调用同步方法，为false时退出循环；
            if (!method())
                break;
        }
    }

    public static synchronized boolean method() {
        if (target > 0) {
            System.out.println(Thread.currentThread().getName() + ":" + target);
            target--;
            return true;
        } else
            return false;
    }
}

class ThreadTest4 implements Runnable {

    public int target = 100;

    @Override
    public void run() {
        while (true) {
            // 调用同步方法，为false时退出循环；
            if (!method())
                break;
        }
    }

    public synchronized boolean method() {
        if (target > 0) {
            System.out.println(Thread.currentThread().getName() + ":" + target);
            target--;
            return true;
        } else
            return false;
    }
}
