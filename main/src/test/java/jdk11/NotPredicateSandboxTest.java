package jdk11;

import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.function.IntPredicate;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class NotPredicateSandboxTest {

    @Test
    public void notPredicate() {
        List<Integer> odd = IntStream.range(1, 100)
                .boxed()
                .filter(Predicate.not(i -> i % 2 == 0))
                .collect(Collectors.toList());

        assertEquals(50, odd.size());
        assertTrue(odd.stream()
                .allMatch(i -> i % 2 == 1));
    }
}
