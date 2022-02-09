package br.com.jhegnerlabs.lambda.parte6;

// A Closure is a function that refers to free variabels in its lexical context
public class JavaClosure {

    public static void main(String[] args) {

        var val = 111;

        Task lambda = () -> {
            var val2 = 110;
            System.out.println(val);
            System.out.println("Task Completed");
            System.out.println(val2);
//            System.out.println("#####" + e);
        };

        printValue(lambda);
        lambda.doTask();
    }

    private static void printValue(Task lambda) {

        lambda.doTask();
    }

}
