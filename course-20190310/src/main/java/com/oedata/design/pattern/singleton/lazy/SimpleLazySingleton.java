package com.oedata.design.pattern.singleton.lazy;

/**
 * 优点：线程安全，懒加载
 * 缺点：锁的粒度太大，容易阻塞、通过反射和序列化可以破坏单例
 *
 */
public class SimpleLazySingleton {
    private static SimpleLazySingleton simpleLazy = null;

    /**
     * 私有构造函数
     *
     */
    private SimpleLazySingleton() {

    }

    /**
     * 提供公开访问方法
     *
     * @return
     */
    public synchronized static final SimpleLazySingleton getInstance() {
        if(simpleLazy == null) {
            simpleLazy = new SimpleLazySingleton();
        }
        return simpleLazy;
    }
}
