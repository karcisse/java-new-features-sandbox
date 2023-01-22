package com.itechart.records;

public record Person(
        String firstName,
        String lastName,
        Integer age) {

    public Person {
        if(age < 0) {
            throw new IllegalArgumentException("Age cannot be negative");
        }
    }
}
