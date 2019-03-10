package com.oedata.design.pattern.singleton.lazy;


/**
 * 优点：细化锁的粒度
 * 缺点:通过反射和序列化可以破坏单例
 *
 */
public class DoubleCheckSingleton {

    private static volatile DoubleCheckSingleton doubleCheck = null; // 使用volatile防止指令重排序

    /**
     * 私有构造函数
     *
     */
    private DoubleCheckSingleton() {

    }

    /**
     * 提供公开访问方法
     *
     * @return
     */
    public static final DoubleCheckSingleton getInstance() {
        if(doubleCheck == null) {
            synchronized (DoubleCheckSingleton.class) {
                if (doubleCheck == null) {
                    doubleCheck = new DoubleCheckSingleton();
                }
            }
        }
        return doubleCheck;
    }
}
