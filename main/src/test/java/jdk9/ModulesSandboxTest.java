package jdk9;

import com.itechart.jdk9.ModulesSandbox;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ModulesSandboxTest {

    @Test
    public void testProvidingService() {
        ModulesSandbox sandbox = new ModulesSandbox();
        assertEquals("I am service A", sandbox.sandbox());
    }
}
