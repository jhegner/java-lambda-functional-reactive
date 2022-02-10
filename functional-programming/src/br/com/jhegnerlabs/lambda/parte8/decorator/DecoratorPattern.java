package br.com.jhegnerlabs.lambda.parte8.decorator;

public class DecoratorPattern {

    public static void main(String[] args) {

        var myorder = new BurgerShop(Burger::addCheese)
                .use(new BurgerShop(Burger::addVeggies)
                        .use(new Burger()));

        System.out.println("I get " + myorder);

    }

}
