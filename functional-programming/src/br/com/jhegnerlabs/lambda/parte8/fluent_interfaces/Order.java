package br.com.jhegnerlabs.lambda.parte8.fluent_interfaces;

import br.com.jhegnerlabs.lambda.parte6.Function;

import java.util.LinkedList;
import java.util.List;

public class Order {

    private List<String> cart = new LinkedList<>();
    private String address = "";

    public Order() {
    }

    private Order(List<String> cart, String address) {
        this.cart = cart;
        this.address = address;
    }

    public Order add(String item) {
        cart.add(item);
        System.out.println(item + " added do the cart");
        return new Order(this.cart, this.address);
    }

    public Order deliveryAt(String location) {
        this.address = location;
        System.out.println("The delivery address set by you - " + location);
        return new Order(this.cart, this.address);
    }

    public static void place(Function<Order, Order> function) {
        var order = new Order();
        order = function.apply(order);
        System.out.println("Order placed");
        System.out.println(order.cart.size() + " items ordered " + "Address: " + order.address);
    }

}
