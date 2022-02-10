package br.com.jhegnerlabs.lambda.parte8.decorator;

import br.com.jhegnerlabs.lambda.parte6.Function;

public class BurgerShop {

    Function<Burger, Burger> decoration;

    public BurgerShop(Function<Burger, Burger> decoration) {
        this.decoration = decoration;
    }

    public Burger use(Burger baseBurger) {
        System.out.println("Base Burger: " + baseBurger);
        return decoration.apply(baseBurger);
    }

}
