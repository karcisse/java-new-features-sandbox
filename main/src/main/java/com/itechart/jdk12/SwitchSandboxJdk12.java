package com.itechart.jdk12;

import com.itechart.preview.SwitchSandbox;

public class SwitchSandboxJdk12 implements SwitchSandbox {

    @Override
    public String switchForValue(SteakWellness wellness) {
        return switch (wellness) {
            case MEDIUM_RARE, MEDIUM, MEDIUM_WELL -> "Kind of medium";
            case RARE -> "Rare";
            case WELL_DONE -> "Well done";
        };
    }
}
