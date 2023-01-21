package com.itechart.jdk13;

import com.itechart.jdk12.SteakWellness;
import com.itechart.preview.SwitchSandbox;

public class SwitchSandboxJdk13 implements SwitchSandbox {
    @Override
    public String switchForValue(SteakWellness wellness) {
        return switch (wellness) {
            case MEDIUM_RARE, MEDIUM, MEDIUM_WELL -> {
                yield "Kind of medium";
            }
            case RARE -> {
                yield "Rare";
            }
            case WELL_DONE -> {
                yield "Well done";
            }
        };
    }
}
