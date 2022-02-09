package br.com.jhegnerlabs.lambda.parte6;

public class FunctionalComposition {

    public static void main(String[] args) {

        Function<Square, Integer> fun1 = Square::getArea;
        Function<Integer, Double> fun2 = Math::sqrt;

        Function<Square, Double> getSide = fun2.compose(fun1);

        Square s = new Square();
        s.setArea(80);

        Double side = getSide.apply(s);

        System.out.println(side);

    }
}
