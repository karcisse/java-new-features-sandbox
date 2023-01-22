package com.itechart.jdk16;

import java.util.List;
import java.util.stream.Stream;

public class StreamToListSandbox {

    public List<Integer> streamToList() {
        return Stream.of("1", "2", "3", "4")
                .map(Integer::valueOf)
                .toList();
    }
}
