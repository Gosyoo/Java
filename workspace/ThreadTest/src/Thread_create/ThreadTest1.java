package Thread_create;
public class ThreadTest1 extends Thread {
    @Override
    public void run() {
        // 打印100以内偶数
        for (int i = 0; i < 100; i++) {
            if(i % 2 == 0)
            System.out.println(this.getName() + i);   
        }
    }

    public ThreadTest1(String name){
        super(name);
    }
}

