package br.com.jhegnerlabs.rxjavamylabs;

import br.com.jhegnerlabs.rxjavamylabs.dto.Food;
import br.com.jhegnerlabs.rxjavamylabs.dto.Fox;
import br.com.jhegnerlabs.rxjavamylabs.services.*;

public class App {

    public static void main(String[] args) {

        try {

            var dogService = new DogService();
            System.out.println(dogService.call());

            var catService = new CatService();
            System.out.println(catService.call());

            var foxService = new FoxService();
            System.out.println(foxService.call());

            var carService = new CarService();
            System.out.println(carService.call());

            var foodService = new FoodService();
            System.out.println(foodService.call());

            var friendService = new FriendService();
            System.out.println(friendService.call());

            var climateService = new ClimateService();
            System.out.println(climateService.call());

            var movieService = new MovieService();
            System.out.println(movieService.call());

            var countryService = new CountryService();
            System.out.println(countryService.call());

            var fruitService = new FruitService();
            System.out.println(fruitService.call());

            var bookService = new BookService();
            System.out.println(bookService.call());

            var languageService = new LanguageService();
            System.out.println(languageService.call());

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
