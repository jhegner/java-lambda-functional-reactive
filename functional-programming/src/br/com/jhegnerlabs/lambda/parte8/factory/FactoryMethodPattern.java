package br.com.jhegnerlabs.lambda.parte8.factory;

public class FactoryMethodPattern{

    public static void main(String[] args) {

        Animal animal1 = AnimalFactory.getAnimal("AA");
        System.out.println(animal1.som());

    }

}
