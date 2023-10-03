package com.swapi.tests;

import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import org.junit.jupiter.api.Test;

import java.io.IOException;

import static org.assertj.core.api.Assertions.assertThat;

public class TestPerson {

    @Test
    void name() {
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
}
