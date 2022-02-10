package br.com.jhegnerlabs.lambda.parte8.factory;

import java.util.Objects;
import java.util.function.Supplier;

final public class AnimalFactory {

    public enum Day { SUNDAY, MONDAY, TUESDAY,
        WEDNESDAY, THURSDAY, FRIDAY, SATURDAY; }


//    public static void main(String[] args) {
//
//        String day = Day.WEDNESDAY.toString();
//        int numLetters = switch (day) {
//            case "MONDAY", "FRIDAY", "SUNDAY" -> 6;
//            case "TUESDAY" -> 7;
//            case "THURSDAY", "SATURDAY" -> 8;
//            case "WEDNESDAY" -> 9;
//            default -> throw new IllegalStateException("Invalid day: " + day);
//        };
//        System.out.println(numLetters);
//
//    }


    public static Animal getAnimal(String letra) throws IllegalStateException {

        Objects.requireNonNull(letra, "A letra deve ser informada");

        Animal animal = switch (letra) {
            case "A" -> new Abelha();
            case "C" -> new Cachorro();
            case "G" -> new Gato();
            case "M" -> new Mosca();
            default -> throw new IllegalStateException("Letra invalida para identificar o Animal");
        };

        Supplier<Animal> animalSupplier = () -> animal;
        return animalSupplier.get();
    }

}
