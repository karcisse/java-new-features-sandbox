package com.itechart.jdk9;

import java.time.Duration;
import java.time.Instant;
import java.util.Arrays;
import java.util.Optional;

public class ProcessAPISandbox {

    public void logProcessInfo() {
        ProcessHandle currentProcess = ProcessHandle.current();
        System.out.println("PID: " + currentProcess.pid());
        ProcessHandle.Info procInfo = currentProcess.info();
        System.out.println("Proc info: " + procInfo);

        procInfo.arguments().ifPresent(args -> System.out.println("Arguments: " + Arrays.toString(args)));
        procInfo.commandLine().ifPresent(cmd -> System.out.println("CMD: " + cmd));
        procInfo.startInstant().ifPresent(start -> System.out.println("Start time: " + start));
        procInfo.totalCpuDuration().ifPresent(cpuUsage -> System.out.println("CPU usage: " + cpuUsage));
        procInfo.user().ifPresent(user -> System.out.println("User: " + user));
    }
}
