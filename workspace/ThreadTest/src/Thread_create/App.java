package Thread_create;
public class App {
    public static void main(String[] args) throws Exception {
        /** 多线程执行 */
        // ThreadText1();

        /** yield 方法：释放当前cpu时间片的使用权 */
        // ThreadTest2();

        /**join()方法： 
         * 主线程调用线程b的join方法，阻塞主线程的执行，直至线程b执行完毕，继续执行主线程*/
        // ThreadText3();

        /**sleep方法：
         * 阻塞线程固定的时间
         */
        // ThreadText4();

        /**isAlive():
         * 判断线程是否存活：线程run()方法执行结束时，该线程死亡
         */

        /**多线程的第二种创建方式 */
        /** 通过类实现Runnable接口的方式 */
        // CreateThreadByRunnableMethod();
    }

    private static void CreateThreadByRunnableMethod() {
        /**多线程售票模拟 ： 存在线程安全隐患*/
        CreateThreadByRunnable create1 = new CreateThreadByRunnable();
        
        Thread window1 = new Thread(create1);
        Thread window2 = new Thread(create1);
        Thread window3 = new Thread(create1);

        window1.setName("窗口1");
        window2.setName("窗口2");
        window3.setName("窗口3");

        window1.start();
        window2.start();
        window3.start();
    }

    private static void ThreadText4() {
        //间隔一秒打印一次
        new Thread("sleep线程："){
            @Override
            public void run() {
                for (int i = 0; i < 100; i++) {
                    if (i % 2 == 0) {
                        try {
                            sleep(1000); //该异常只能try/catch处理，因为父类中没有throws，子类不能throws
                        } catch (InterruptedException e) {
                            // TODO Auto-generated catch block
                            e.printStackTrace();
                        }
                        System.out.println(Thread.currentThread().getName() + i);
                    }
                }
            }
        }.start();
    }

    private static void ThreadText3() throws InterruptedException {
        /**
         * join()方法： 
         * 主线程调用线程b的join方法，阻塞主线程的执行，直至线程b执行完毕，继续执行主线程
         *  -当多个线程同时执行时，主线程执行join方法，只阻塞主线程执行，
         *  -线程a，线程b正常执行，直至线程b执行完毕，主线程取消阻塞。
         */
        new Thread("线程a") {
            @Override
            public void run() {
                for (int i = 0; i < 100; i++) {
                    if (i % 2 == 0) {
                        System.out.println(Thread.currentThread().getName() + i);
                    }
                }
            }
        }.start();

        Thread b = new Thread("线程b") {
            @Override
            public void run() {
                for (int i = 0; i < 100; i++) {
                    if (i % 2 == 0) {
                        System.out.println(Thread.currentThread().getName() + i);
                    }
                }
            }
        };

        b.start();

        Thread.currentThread().setName("主线程：");
        for (int i = 0; i < 100; i++) {
            if (i % 2 == 0)
                System.out.println(Thread.currentThread().getName() + i);
            if (i == 20) {
                b.join();
            }
        }
    }

    private static void ThreadTest2() {
        Thread t2 = new Thread("线程2：") {
            @Override
            public void run() {
                for (int i = 0; i < 100; i++) {
                    if (i % 2 == 0)
                        System.out.println(Thread.currentThread().getName() + i);
                    if (i % 20 == 0) {
                        yield();
                    }
                }
            }
        };

        t2.start();

        Thread.currentThread().setName("主线程：");
        for (int i = 0; i < 100; i++) {
            if (i % 2 == 0)
                System.out.println(Thread.currentThread().getName() + i);
        }
    }

    private static void ThreadText1() {
        /** 多线程执行 */
        ThreadTest1 t1 = new ThreadTest1("");
        t1.setName("线程1：");
        t1.start();

        Thread.currentThread().setName("主线程：");
        for (int i = 0; i < 100; i++) {
            if (i % 2 == 0)
                System.out.println(Thread.currentThread().getName() + i);
        }
    }
}
