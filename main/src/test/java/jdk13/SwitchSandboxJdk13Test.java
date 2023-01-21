package jdk13;

import com.itechart.jdk13.SwitchSandboxJdk13;
import com.itechart.preview.SwitchSandbox;
import preview.BaseSwitchSandboxTest;

public class SwitchSandboxJdk13Test extends BaseSwitchSandboxTest {
    @Override
    protected SwitchSandbox getSandbox() {
        return new SwitchSandboxJdk13();
    }
}
