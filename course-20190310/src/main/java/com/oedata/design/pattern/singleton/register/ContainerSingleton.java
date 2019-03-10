package com.oedata.design.pattern.singleton.register;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;


/**
 * 优点：使用双重检验细化锁的粒度
 *
 */
public class ContainerSingleton {

    private static Map<String, Object> map = new ConcurrentHashMap<>();

    public static final Object getInstance(String className) {
        if (!map.containsKey(className)) {
            synchronized (ContainerSingleton.class) {
                if (!map.containsKey(className)) {
                    try {
                        Class<?> clazz = Class.forName(className);
                        Object object = clazz.newInstance();
                        map.put(className, object);
                        return object;
                    } catch (ClassNotFoundException e) {
                        e.printStackTrace();
                    } catch (IllegalAccessException e) {
                        e.printStackTrace();
                    } catch (InstantiationException e) {
                        e.printStackTrace();
                    }
                }
            }
        }
        return map.get(className);
    }
}
