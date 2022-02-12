package br.com.jhegnerlabs.lambda.parte9;

public class SettingParallelism {

    public static void main(String[] args) {

        System.out.println(Runtime.getRuntime().availableProcessors());

        System.setProperty("java.util.concurrent.ForkJoinPool.common.parallelism", "2");

        System.out.println(Runtime.getRuntime().availableProcessors());

    }

}
