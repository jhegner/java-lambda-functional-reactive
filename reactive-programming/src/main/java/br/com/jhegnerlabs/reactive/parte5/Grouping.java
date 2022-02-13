package br.com.jhegnerlabs.reactive.parte5;

import br.com.jhegnerlabs.reactive.parte5.poc.Funcionario;
import io.reactivex.rxjava3.core.Observable;

import java.math.BigDecimal;
import java.util.List;

public class Grouping {

    public static void main(String[] args) {

        var source = Observable.fromIterable(
                List.of(
                        new Funcionario("Pedro", BigDecimal.valueOf(200.10), "RH"),
                        new Funcionario("Maria", BigDecimal.valueOf(2000), "TI"),
                        new Funcionario("Andre", BigDecimal.valueOf(3200.00), "RH"),
                        new Funcionario("Jose", BigDecimal.valueOf(232.25), "ENG"),
                        new Funcionario("Afonso", BigDecimal.valueOf(232.25), "RH"),
                        new Funcionario("Eduardo", BigDecimal.valueOf(232.25), "ENG"),
                        new Funcionario("Joao", BigDecimal.valueOf(232.25), "ENG"),
                        new Funcionario("Kaio", BigDecimal.valueOf(232.25), "TI")
                )
        );

        source.groupBy(e -> e.getDepartamento())
                .flatMapSingle(e -> e.toMultimap(key -> e.getKey(), emp -> emp.getNome()))
                .subscribe(System.out::println);
    }

}
