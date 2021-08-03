package Thread_safe;

/** 单例 （懒汉式）优化为线程安全的 */
public class Single_lazy_safe {

    private static Single_lazy_safe instance = null;

    // 私有的构造函数
    private Single_lazy_safe() {

    }

    // 公开的获取方法
    public static Single_lazy_safe getInstance() {
        //判断是否创建，双重检测提高多线程效率
        //不为null时不进入同步
        if (instance == null) {
            //同步代码块
            synchronized (Single_lazy_safe.class) {
                //检测为空
                if (instance == null) {
                    instance = new Single_lazy_safe();
                }
            }
        }
        return instance;
    }
}
