package br.com.jhegnerlabs.lambda.parte4;

import java.util.List;
import java.util.function.Consumer;

public class ConsumerPratice {

    public static void main(String[] args) {
        List<Integer> list = List.of(12, 23, 4, 40, 22, 45, 5);
        Consumer<Integer> consumer = System.out :: println;
        consumer.accept(32);

        printElements(list, consumer);
    }

    private static <T> void printElements(List<T> list, Consumer<T> consumer) {

        list.forEach(consumer);

    }

}
