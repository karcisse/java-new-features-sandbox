package com.itechart.jdk9;

import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;

public class NewAPIsSandbox {

    private static final Set<String> IMMUTABLE_SET = Set.of(
            "Finally",
            "I",
            "can",
            "create",
            "immutable",
            "set",
            "just",
            "like",
            "that",
            "!"
    );

    private void optionalToStream() {
        List<String> containingLetterA = IMMUTABLE_SET.stream()
                .map(this::process)
                .flatMap(Optional::stream)
                .collect(Collectors.toList());
    }

    private Optional<String> process(String s) {
        if (s.contains("a")) {
            return Optional.of(s);
        }
        return Optional.empty();
    }
}
