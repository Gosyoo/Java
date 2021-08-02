package Thread_create;
public class CreateThreadByRunnable implements Runnable{

    private int target = 100;

    @Override
    public void run() {
       while (true) {
           if( target > 0){
               System.out.println(Thread.currentThread().getName()+": 出票号为：" + target);
               target--;
           }else{
               break;
           }
       }   
    }

}