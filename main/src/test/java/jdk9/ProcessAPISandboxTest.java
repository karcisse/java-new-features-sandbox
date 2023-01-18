package jdk9;

import com.itechart.jdk9.ProcessAPISandbox;
import org.junit.jupiter.api.Test;

public class ProcessAPISandboxTest {

    @Test
    public void test() {
        new ProcessAPISandbox().logProcessInfo();
    }
}
