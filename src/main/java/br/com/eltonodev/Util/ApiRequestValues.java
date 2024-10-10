package br.com.eltonodev.Util;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ApiRequestValues {
    String json;

    public ApiRequestValues(String moeda) {
        try {
            HttpClient client = HttpClient.newHttpClient();
            HttpRequest request = HttpRequest.newBuilder()
                    .uri(URI.create("https://v6.exchangerate-api.com/v6/00aa8ce48dff84b5c0982206/latest/" + moeda))
                    .build();
            HttpResponse<String> response = client
                    .send(request, HttpResponse.BodyHandlers.ofString());
            json = response.body();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
