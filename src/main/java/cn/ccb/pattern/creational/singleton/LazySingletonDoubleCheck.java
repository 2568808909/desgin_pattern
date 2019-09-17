package cn.ccb.pattern.creational.singleton;

public class LazySingletonDoubleCheck {

    /**
     * 用volatile制造内存屏障防止指令重排
     */
    private static volatile LazySingletonDoubleCheck instance = null;

    private LazySingletonDoubleCheck() {
    }

    public static LazySingletonDoubleCheck getInstance() {
        if (instance == null) {
            synchronized (LazySingletonDoubleCheck.class) {
                if (instance == null) {
                    /**
                     * new操作的三个步骤：
                     * 1.分配内存空间
                     * 2.初始化对象
                     * 3.引用指向所分配的内存空间
                     * 由于java虚拟机允许哪些不影响单线程执行结果的指令重排序
                     * 所以专利有可能3和2的顺序会调转，这就可能出现一个情况：引用
                     * 指向了内存空间，其他的线程进入次方法，第一次判空时就返回false，
                     * 然后就直接返回未初始化的对象，并使用该对象，这样是存在隐患的，所以
                     * 我们可以使用volatile关键字修饰对象，禁止指令重排。
                     */
                    instance = new LazySingletonDoubleCheck();
                }
            }
        }
        return instance;
    }
}
