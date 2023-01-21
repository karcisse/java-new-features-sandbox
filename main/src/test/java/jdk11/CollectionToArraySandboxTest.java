package jdk11;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class CollectionToArraySandboxTest {

    @Test
    public void collectionToArray() {
        List<String> strings = Arrays.asList("This", "is", "array");
        String[] strArr = strings.toArray(String[]::new);

        String[] expected = {"This", "is", "array"};
        assertArrayEquals(expected, strArr);
    }
}
