package jdk14;

import com.itechart.jdk14.Person;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;

import static org.junit.jupiter.api.Assertions.*;

public class RecordSandboxTest {

    @Test
    public void sandbox() {
        Person p = new Person("Jhon", "Smith", 54);

        assertEquals("Jhon", p.firstName());
        assertEquals("Smith", p.lastName());
        assertEquals(54, p.age());
    }

    @Test
    public void checkCustomConstructor() {
        Executable exec = () -> {
            Person p = new Person("Jhon", "Smith", -54);
        };

        assertThrows(IllegalArgumentException.class, exec);
    }

    @Test
    public void toStringEqualsHashCode() {
        Person p1 = new Person("Jhon", "Smith", 54);
        Person p2 = new Person("Jhon", "Doe", 54);
        Person p3 = new Person("Jhon", "Smith", 54);

        assertEquals(p1, p3);
        assertNotEquals(p1, p2);
        assertNotEquals(p3, p2);

        assertEquals(p1.hashCode(), p3.hashCode());
        assertNotEquals(p1.hashCode(), p2.hashCode());
        assertNotEquals(p3.hashCode(), p2.hashCode());

        System.out.println(p1);
        System.out.println(p2);
    }
}
