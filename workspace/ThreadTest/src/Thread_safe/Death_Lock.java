package Thread_safe;

/** 死锁问题 */
public class Death_Lock {
    public static void main(String[] args) {
        
        StringBuffer lock_1 = new StringBuffer();
        StringBuffer lock_2 = new StringBuffer();
        
        // 匿名线程对象
        new Thread(new Runnable(){
            @Override
            public void run() {
                synchronized(lock_1){
                    lock_1.append("线程1： 锁1");
                    lock_2.append("线程1： 锁1");
                }
                synchronized(lock_2){
                    lock_1.append("线程1： 锁2");
                    lock_2.append("线程1： 锁2");
                }
            }
        }).start();

        new Thread(new Runnable(){
            @Override
            public void run() {
                synchronized(lock_2){
                    lock_1.append("线程2： 锁2");
                    lock_2.append("线程2： 锁2");
                }
                synchronized(lock_1){
                    lock_1.append("线程2： 锁1");
                    lock_2.append("线程2： 锁1");
                }
            }
        }).start();
    }
}


