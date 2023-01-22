package jdk17;

import com.itechart.jdk15.*;
import com.itechart.jdk17.PatternMatchingSandbox;
import com.itechart.records.Person;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PatternMatchingSandboxTest {

    private final PatternMatchingSandbox sandbox = new PatternMatchingSandbox();

    @Test
    public void sandbox() {
        assertEquals("John", sandbox.checkObject(
                new Person("John", "Smith", 20)));
        assertEquals(GermanSheppard.class.getSimpleName(), sandbox.checkObject(new GermanSheppard()));
        assertEquals(Husky.class.getSimpleName(), sandbox.checkObject(new Husky()));
        assertEquals(Dog.class.getSimpleName(), sandbox.checkObject(new Dog()));
        assertEquals(Cat.class.getSimpleName(), sandbox.checkObject(new Cat()));
        RoboCat roboCat = new RoboCat();
        roboCat.setAge(123);
        assertEquals(RoboCat.class.getSimpleName(), sandbox.checkObject(roboCat));
        assertEquals("Not produced robo cat", sandbox.checkObject(new RoboCat()));
        assertEquals("NULL", sandbox.checkObject(null));
        assertEquals("Wow, case default", sandbox.checkObject("TEXT"));
    }
}
