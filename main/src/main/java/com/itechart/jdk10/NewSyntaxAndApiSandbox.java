package com.itechart.jdk10;

import java.util.HashMap;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.stream.Collectors;

public class NewSyntaxAndApiSandbox {

    public void localVariableType() {
        var idToNameMap = initMap();
        String name = idToNameMap.get(12);
        Integer id = idToNameMap.keySet().stream().findAny().orElse(0);

        var idToNameMapUnknownType = new HashMap<>();
        // this returns Object - ERROR
//        String unknownTypeName = idToNameMapUnknownType.get(12);
    }

    public void unmodifiableCollections() {
        List<Integer> immutableList = List.copyOf(initMap().keySet());
        Set<String> immutableSet = Set.copyOf(initMap().values());

        List<Integer> immutableListFromStream = initMap().keySet().stream()
                .collect(Collectors.toUnmodifiableList());
        Set<String> immutableSetFromStream = initMap().values().stream()
                .collect(Collectors.toUnmodifiableSet());

        try {
            immutableList.stream()
                    .filter(i -> i % 2 == 0)
                    .findAny()
                    .orElseThrow();
        } catch (NoSuchElementException e) {
            System.err.println("Element not found " + e.getMessage());
        }
    }

    private HashMap<Integer, String> initMap() {
        return new HashMap<>();
    }
}
