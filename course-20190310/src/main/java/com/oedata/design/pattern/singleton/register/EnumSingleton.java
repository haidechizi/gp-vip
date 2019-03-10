package com.oedata.design.pattern.singleton.register;


/**
 * 利用枚举实现单例
 * 优点：无法反、序列化破坏单例
 * 缺点：对象不使用时浪费内存（非懒加载）
 * <p>
 * 枚举类无法反射
 */
public enum EnumSingleton {

    INSTANCE;

    public static final EnumSingleton getInstance() {
        return INSTANCE;
    }
}
