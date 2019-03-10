package com.oedata.design.pattern.singleton.threadlocal;


/**
 * 相同线程是单例的
 */
public class ThreadLocalSingleton {

    private static ThreadLocal<ThreadLocalSingleton> threadLocal = new ThreadLocal<ThreadLocalSingleton>() {
        @Override
        protected ThreadLocalSingleton initialValue() {
            return new ThreadLocalSingleton();
        }
    };

    public static final ThreadLocalSingleton getInstance() {
        return threadLocal.get();
    }
}
