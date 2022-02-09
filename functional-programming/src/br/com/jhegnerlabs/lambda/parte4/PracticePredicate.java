package br.com.jhegnerlabs.lambda.parte4;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class PracticePredicate {

    public static void main(String[] args) {

        var list = List.of("Basics", "", "Strong", "", "BasicsStrong", "BasicXs");

        Predicate<String> predicate = s -> !s.isEmpty();

        var newList = filterList(list, predicate);

        System.out.println(newList);

        Predicate<String> predicateFilter = s -> s.contains("Basics");

        var filteredList = filterList(list, predicateFilter);

        System.out.println(filteredList);

        var intList =  List.of(1, 2, 3, 4, 5,6, 7,8);

        Predicate<Integer> integerFilter = e -> e % 2 == 0;
        System.out.println(filterList(intList, integerFilter));
    }

    private static <T> List<T> filterList(List<T> list, Predicate<T> predicate) {

        var newList = new ArrayList<T>();

        for(T value : list){
            if(predicate.test(value)) {
                newList.add(value);
            }
        }

        return newList;
    }

}
