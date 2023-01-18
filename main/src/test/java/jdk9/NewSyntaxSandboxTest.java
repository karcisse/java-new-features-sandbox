package jdk9;

import com.itechart.jdk9.NewSyntaxSandbox;
import org.junit.jupiter.api.Test;

public class NewSyntaxSandboxTest {

    private final NewSyntaxSandbox sandbox = new NewSyntaxSandbox();

    @Test
    public void testPrivateMethodsInInterface() {
        sandbox.interfaceWithPrivateMethods();
    }

    @Test
    public void testDiamondOperator() {
        sandbox.diamondOperatorExtension();
    }

}
