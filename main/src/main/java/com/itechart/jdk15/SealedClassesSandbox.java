package com.itechart.jdk15;

public class SealedClassesSandbox {

    public String instanceOfForSealed(Animal animal) {
        if (animal instanceof Dog dog) {
            if (dog instanceof Husky husky) {
                return husky.getClass().getSimpleName();
            } else if (dog instanceof GermanSheppard german) {
                return german.getClass().getSimpleName();
            } else {
                return dog.getClass().getSimpleName();
            }
        } else if (animal instanceof Cat cat) {
            if (cat instanceof RoboCat roboCat) {
                return roboCat.getClass().getSimpleName();
            } else {
                return cat.getClass().getSimpleName();
            }
        }
        return null;
    }
}
