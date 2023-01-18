package com.itechart.trusted;

import com.itechart.secret.api.Api;
import com.itechart.secret.internal.Secret;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        Secret secret = new Secret();
        Api api = new Api();
    }
}