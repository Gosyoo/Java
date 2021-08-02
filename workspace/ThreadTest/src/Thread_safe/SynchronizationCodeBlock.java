package Thread_safe;

/** 同步代码块 
 * 
 * synchronized(同步监视器){
 *      操作共享数据的代码；
 * }
 * 
 * 注： 1.同步监视器可以是任何一个Object对象
 *          同步监视器必须是公用的（多个线程唯一的）
 *          同步监视器也称同步锁
 *      2.synchronized代码块包裹住的代码只为操作共享数据的代码
 *          包裹过多的代码影响执行结果和执行效率
 *          包裹过少的代码线程不安全
 */
public class SynchronizationCodeBlock {
    public static void main(String[] args) {
        //继承Thread类的方式：
        // ThreadTest1 t1 = new ThreadTest1();
        // ThreadTest1 t2 = new ThreadTest1();

        // t1.setName("线程1 ");
        // t2.setName("线程2 ");

        // t1.start();
        // t2.start();



        //实现Runnable接口的方式：
        ThreadTest2 ts1 = new ThreadTest2();
        
        Thread t1 = new Thread(ts1);
        Thread t2 = new Thread(ts1);

        t1.setName("线程1 ");
        t2.setName("线程2 ");

        t1.start();
        t2.start();
    }
}

class ThreadTest1 extends Thread {
    // 静态公有变量
    public static int target = 100;

    // 重写run方法
    @Override
    public void run() {
        while (true) {
            synchronized (ThreadTest1.class) {
                if (target > 0) {
                    System.out.println(Thread.currentThread().getName() + ":" + target);
                    target--;
                } else
                    break;
            }
        }
    }
}

class ThreadTest2 implements Runnable {

    public int target = 100;

    @Override
    public void run() {
        while (true) {
            synchronized (this) {
                if (target > 0) {
                    System.out.println(Thread.currentThread().getName() + ":" + target);
                    target--;
                } else
                    break;
            }
        }
    }

}
