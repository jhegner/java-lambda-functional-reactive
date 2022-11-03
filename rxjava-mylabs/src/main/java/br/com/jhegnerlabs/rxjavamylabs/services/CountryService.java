package br.com.jhegnerlabs.rxjavamylabs.services;

import br.com.jhegnerlabs.rxjavamylabs.dto.Car;
import br.com.jhegnerlabs.rxjavamylabs.dto.Country;
import com.google.gson.Gson;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.List;

public class CountryService {

    public List<Country> call() throws Exception {

        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create("http://localhost:3003/rxjavatest/countries"))
                .method("GET", HttpRequest.BodyPublishers.noBody())
                .build();
        HttpResponse<String> response = HttpClient.newHttpClient().send(request, HttpResponse.BodyHandlers.ofString());

        return List.of(new Gson().fromJson(response.body(), Country.class));

    }

}
