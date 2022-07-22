package com.futurecollars.lesson15.task1;

import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.nio.file.Files;
import java.nio.file.Paths;

public class WebPageWriter {

    public static void main(String[] args) throws IOException, URISyntaxException, InterruptedException {

        HttpClient httpClient = HttpClient.newBuilder().build();

        HttpRequest httpRequest =
                HttpRequest.newBuilder(new URI("https://futurecollars.com/"))
                        .GET()
                        .build();

        HttpResponse<String> httpResponse = httpClient
                .send(httpRequest, HttpResponse.BodyHandlers.ofString());

        if (httpResponse.statusCode() < 400) {
            Files.writeString(Paths.get("src/main/resources/html.txt"), httpResponse.body());
        }
    }

}
