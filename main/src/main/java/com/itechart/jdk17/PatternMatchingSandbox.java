package com.itechart.jdk17;

import com.itechart.jdk15.*;
import com.itechart.records.Person;

public class PatternMatchingSandbox {

    public String checkObject(Object o) {
        return switch (o) {
            case Person p -> p.firstName();
            case GermanSheppard german -> german.getClass().getSimpleName();
            case Husky husky -> husky.getClass().getSimpleName();
            case RoboCat roboCat && roboCat.getAge() == 0 -> "Not produced robo cat";
            case RoboCat roboCat -> roboCat.getClass().getSimpleName();
            case Dog dog -> dog.getClass().getSimpleName();
            case Cat cat -> cat.getClass().getSimpleName();
            case null -> "NULL";
            case default -> "Wow, case default";
        };
    }
}
