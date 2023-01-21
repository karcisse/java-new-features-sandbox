package jdk12;

import com.itechart.jdk12.SteakWellness;
import com.itechart.jdk12.SwitchSandbox;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SwitchSandboxTest {

    private final SwitchSandbox sandbox = new SwitchSandbox();

    @Test
    public void testSandbox() {
        String result = sandbox.switchForValue(SteakWellness.MEDIUM_WELL);
        assertEquals("Kind of medium", result);
    }
}
