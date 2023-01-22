package jdk14;

import com.itechart.jdk14.Person;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RecordSandboxTest {

    @Test
    public void sandbox() {
        Person p = new Person("Jhon", "Smith", 54);

        assertEquals("Jhon", p.firstName());
        assertEquals("Smith", p.lastName());
        assertEquals(54, p.age());
    }
}
