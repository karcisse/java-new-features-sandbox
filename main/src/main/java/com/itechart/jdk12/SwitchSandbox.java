package com.itechart.jdk12;

public class SwitchSandbox {

    public String switchForValue(SteakWellness wellness) {
        return switch (wellness) {
            case MEDIUM_RARE, MEDIUM, MEDIUM_WELL -> "Kind of medium";
            case RARE -> "Rare";
            case WELL_DONE -> "Well done";
        };
    }
}
