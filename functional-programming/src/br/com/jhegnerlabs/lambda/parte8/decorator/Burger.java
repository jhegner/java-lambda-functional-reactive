package br.com.jhegnerlabs.lambda.parte8.decorator;

public class Burger {

    private String burgerType;

    public Burger() {
        this.burgerType = "";
    }

    public Burger(String burgerType) {
        this.burgerType = burgerType;
    }

    public Burger addVeggies() {
        System.out.println("Adding veggies to the burger");
        return new Burger(this.burgerType += " Vegie");
    }

    public Burger addCheese() {
        System.out.println("Adding cheese to the burger");
        return new Burger(this.burgerType += " Cheese");
    }

    @Override
    public String toString() {
        return String.format("%s", burgerType + " burger");
    }
}
