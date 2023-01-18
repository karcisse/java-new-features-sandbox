package com.itechart.jdk9;

import com.itechart.trusted.Service;
import com.itechart.secret.api.Api;

import java.util.ServiceLoader;

public class ModulesSandbox {

    public String sandbox() {
        Api api = new Api();
//    Secret secret = new Secret();

        Service service = ServiceLoader.load(Service.class)
                .findFirst()
                .orElseThrow(RuntimeException::new);
        return service.doSomething();
    }
}
