package com.oedata.design.pattern.singleton.lazy;


/**
 * 静态内部类，利用jvm内部类的加载特性实现懒加载
 * 优点：懒加载
 * 缺点：通过反射和序列化可以破坏单例
 *
 */
public class InnerClassSingleton {

    /**
     * 私有构造函数
     *
     */
    private InnerClassSingleton() {

    }

    /**
     * 提供公开访问方法
     *
     * @return
     */
    public static final InnerClassSingleton getInstance() {
        return InnerHolder.innerClassSingleton;
    }

    private static final class InnerHolder{
        private static final InnerClassSingleton innerClassSingleton = new InnerClassSingleton();
    }
}
