package com.itechart.jdk14;

public class PatternMatchingForInstanceOfSandbox {

    public Object transform(Object o) {
        if (o instanceof String s) {
            return s.transform(String::toUpperCase);
        }
        if (o instanceof Integer i) {
            return i * i;
        }
        return null;
    }
}
