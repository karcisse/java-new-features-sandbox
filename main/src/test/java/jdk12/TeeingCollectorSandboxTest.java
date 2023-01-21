package jdk12;

import org.junit.jupiter.api.Test;

import java.util.stream.Collectors;
import java.util.stream.IntStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TeeingCollectorSandboxTest {

    @Test
    public void checkOutTeeingCollector() {
        double average = IntStream.range(1, 8).boxed()
                .collect(Collectors.teeing(Collectors.summingDouble(i -> i),
                        Collectors.counting(), (sum, count) -> sum / count));
        assertEquals(4.0, average);
    }
}
