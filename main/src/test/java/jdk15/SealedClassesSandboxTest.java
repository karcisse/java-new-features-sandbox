package jdk15;

import com.itechart.jdk15.*;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SealedClassesSandboxTest {

    private final SealedClassesSandbox sandbox = new SealedClassesSandbox();

    @Test
    public void sandbox() {
        assertEquals(Dog.class.getSimpleName(), sandbox.instanceOfForSealed(new Dog()));
        assertEquals(Husky.class.getSimpleName(), sandbox.instanceOfForSealed(new Husky()));
        assertEquals(GermanSheppard.class.getSimpleName(), sandbox.instanceOfForSealed(new GermanSheppard()));
        assertEquals(Cat.class.getSimpleName(), sandbox.instanceOfForSealed(new Cat()));
        assertEquals(RoboCat.class.getSimpleName(), sandbox.instanceOfForSealed(new RoboCat()));
    }
}
