package com.itechart.jdk15;

public abstract sealed class Animal permits Dog, Cat {
    private Integer age = 0;

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}
