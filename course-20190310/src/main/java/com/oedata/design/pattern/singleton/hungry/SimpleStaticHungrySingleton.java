package com.oedata.design.pattern.singleton.hungry;

/**
 * 优点：实现简单
 * 缺点：不使用对象时会浪费内存、通过反射和序列化可以破坏单例
 */
public class SimpleStaticHungrySingleton {

    private static final SimpleStaticHungrySingleton simpleStaticHungry;


    // 通过静态代码块初始化
    static {
        simpleStaticHungry = new SimpleStaticHungrySingleton();
    }


    /**
     * 私有构造函数
     */
    private SimpleStaticHungrySingleton() {

    }

    /**
     * 提供公开访问方法
     *
     * @return
     */
    public static final SimpleStaticHungrySingleton getInstance() {
        return simpleStaticHungry;
    }
}
