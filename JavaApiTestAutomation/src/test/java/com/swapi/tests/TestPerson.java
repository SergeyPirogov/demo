package com.swapi.tests;

import okhttp3.*;
import org.junit.jupiter.api.Test;

import java.io.IOException;

import static org.assertj.core.api.Assertions.assertThat;

public class TestPerson {

    @Test
    void testGetPerson() {
        OkHttpClient client = new OkHttpClient().newBuilder()
                .build();

        Request request = new Request.Builder()
                .url("https://swapi.dev/api/people/1")
                .get()
                .build();
        try {
            Response response = client.newCall(request).execute();
            String responseBody = response.body().string();

            System.out.println(responseBody);

            assertThat(responseBody).contains("Luke Skywalker");

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    void testGetPlanet() {
        OkHttpClient client = new OkHttpClient().newBuilder()
                .build();
        MediaType mediaType = MediaType.parse("text/plain");
        RequestBody body = RequestBody.create(mediaType, "");
        Request request = new Request.Builder()
                .url("https://swapi.dev/api/planets/3/")
                .method("GET", body)
                .build();
        try {
            Response response = client.newCall(request).execute();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
