package jdk12;

import com.itechart.jdk12.SwitchSandboxJdk12;
import com.itechart.preview.SwitchSandbox;
import preview.BaseSwitchSandboxTest;

public class SwitchSandboxJdk12Test extends BaseSwitchSandboxTest {

    @Override
    protected SwitchSandbox getSandbox() {
        return new SwitchSandboxJdk12();
    }
}
