package jdk9;

import com.itechart.jdk9.HttpClientSandbox;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.net.URISyntaxException;
import java.security.KeyManagementException;
import java.security.NoSuchAlgorithmException;

import static org.junit.jupiter.api.Assertions.assertFalse;

public class HttpClientSandboxTest {

    @Test
    public void testSimpleGet() throws IOException, URISyntaxException, InterruptedException, NoSuchAlgorithmException, KeyManagementException {
        String joke = new HttpClientSandbox().sendSimpleRequest();

        assertFalse(joke.isEmpty());
    }
}
