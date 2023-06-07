package com.specialroadproject.entity;

import org.springframework.stereotype.Component;

@Component
public class ValueSingleton {

    private int value = 0;

    private ValueSingleton() {}

    private static class ValueSingletonHolder {
        private static final ValueSingleton INSTANCE = new ValueSingleton();
    }

    public static ValueSingleton getInstance() {
        return ValueSingletonHolder.INSTANCE;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}