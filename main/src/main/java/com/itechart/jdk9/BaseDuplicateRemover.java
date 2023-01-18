package com.itechart.jdk9;

import java.util.stream.IntStream;

public interface BaseDuplicateRemover {

    void calculateWrapper(Integer num);

    default void calculate(Integer num) {
        privateMethod(num);
        privateStaticMethod(num);
    }

    private void privateMethod(Integer num) {
        IntStream.range(0, num)
                .forEach(i -> System.out.println("PRIVATE!"));;
    }

    private void privateStaticMethod(Integer num) {
        IntStream.range(0, num)
                .forEach(i -> System.out.println("PRIVATE STATIC!"));
    }
}
