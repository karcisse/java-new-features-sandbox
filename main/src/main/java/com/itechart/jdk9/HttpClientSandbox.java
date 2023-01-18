package com.itechart.jdk9;

import jdk.incubator.http.HttpClient;
import jdk.incubator.http.HttpRequest;
import jdk.incubator.http.HttpResponse;

import javax.net.ssl.KeyManagerFactory;
import javax.net.ssl.SSLContext;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.security.KeyManagementException;
import java.security.NoSuchAlgorithmException;

public class HttpClientSandbox {

    public String sendSimpleRequest() throws IOException, InterruptedException, NoSuchAlgorithmException, KeyManagementException {

        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create("https://api.chucknorris.io/jokes/random"))
                .GET()
                .build();

        HttpResponse<String> response = HttpClient
                .newBuilder()
                .build()
                .send(request, HttpResponse.BodyHandler.asString());

        return response.body();
    }
}
