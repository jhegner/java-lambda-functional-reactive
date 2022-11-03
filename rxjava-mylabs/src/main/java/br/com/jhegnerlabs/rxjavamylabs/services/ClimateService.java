package br.com.jhegnerlabs.rxjavamylabs.services;

import br.com.jhegnerlabs.rxjavamylabs.dto.Climate;
import br.com.jhegnerlabs.rxjavamylabs.dto.Dog;
import com.google.gson.Gson;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.List;

public class ClimateService {

    public List<Climate> call() throws Exception {

        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create("http://localhost:3003/rxjavatest/climate"))
                .method("GET", HttpRequest.BodyPublishers.noBody())
                .build();
        HttpResponse<String> response = HttpClient.newHttpClient().send(request, HttpResponse.BodyHandlers.ofString());

        return List.of(new Gson().fromJson(response.body(), Climate.class));

    }

}
