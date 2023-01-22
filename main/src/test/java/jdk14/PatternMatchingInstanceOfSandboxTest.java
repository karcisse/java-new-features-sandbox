package jdk14;

import com.itechart.jdk14.PatternMatchingForInstanceOfSandbox;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PatternMatchingInstanceOfSandboxTest {

    private final PatternMatchingForInstanceOfSandbox sandbox
            = new PatternMatchingForInstanceOfSandbox();

    @Test
    public void testInstanceOf() {
        Object string = sandbox.transform("text");
        assertEquals(String.class, string.getClass());
        assertEquals("TEXT", string);

        Object integer = sandbox.transform(2);
        assertEquals(Integer.class, integer.getClass());
        assertEquals(4, integer);
    }
}
