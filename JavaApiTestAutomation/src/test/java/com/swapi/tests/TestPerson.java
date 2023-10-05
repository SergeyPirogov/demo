package com.swapi.tests;

import com.fasterxml.jackson.core.JsonProcessingException;
import okhttp3.Request;
import okhttp3.Response;
import org.example.http.HttpClient;
import org.example.http.HttpResponse;
import org.example.model.GetPersonResponse;
import org.example.model.GetPlanetResponse;
import org.junit.jupiter.api.Test;

import java.io.IOException;

import static org.assertj.core.api.Assertions.assertThat;

public class TestPerson {

    private final String BASE_URL = "https://swapi.dev/api";
    private final HttpClient httpClient = new HttpClient(BASE_URL);

    @Test
    void testGetPerson() {
        HttpResponse response = httpClient.get("/people/1");
        GetPersonResponse getPersonResponse = response.json(GetPersonResponse.class);

        assertThat(getPersonResponse.getName()).isEqualTo("Luke Skywalker");
    }

    @Test
    void testGetPlanet() {
        HttpResponse httpResponse = httpClient.get("/planets/3/");
        GetPlanetResponse getPlanetResponse = httpResponse.json(GetPlanetResponse.class);

        assertThat(getPlanetResponse.getName()).isEqualTo("Yavin IV");
    }
}
