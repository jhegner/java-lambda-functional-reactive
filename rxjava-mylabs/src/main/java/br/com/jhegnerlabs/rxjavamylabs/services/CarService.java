package br.com.jhegnerlabs.rxjavamylabs.services;

import br.com.jhegnerlabs.rxjavamylabs.dto.Car;
import br.com.jhegnerlabs.rxjavamylabs.dto.Fox;
import com.google.gson.Gson;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.List;

public class CarService {

    public List<Car> call() throws Exception {

        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create("http://localhost:3003/rxjavatest/cars"))
                .method("GET", HttpRequest.BodyPublishers.noBody())
                .build();
        HttpResponse<String> response = HttpClient.newHttpClient().send(request, HttpResponse.BodyHandlers.ofString());

        return List.of(new Gson().fromJson(response.body(), Car.class));

    }

}
