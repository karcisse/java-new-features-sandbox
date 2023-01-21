package preview;

import com.itechart.jdk12.SteakWellness;
import com.itechart.preview.SwitchSandbox;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public abstract class BaseSwitchSandboxTest {

    @Test
    public void testSandbox() {
        String result = getSandbox().switchForValue(SteakWellness.MEDIUM_WELL);
        assertEquals("Kind of medium", result);
    }
    protected abstract SwitchSandbox getSandbox();
}
