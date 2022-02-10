package br.com.jhegnerlabs.lambda.parte8.fluent_interfaces;

public class FluentShopping {

    public static void main(String[] args) {

        Order.place(order ->
                order.add("Tenis")
                        .add("T'Shirts")
                        .deliveryAt("Rua Paralamas do Sucesso nº 21")
        );
    }

}
