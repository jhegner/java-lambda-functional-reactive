package br.com.jhegnerlabs.reactive.parte1;

public class CallBackDemo {

    public static void main(String[] args) throws InterruptedException {
        System.out.println("A Thread principal esta sendo executada");
        var runnable = new Runnable() {
            @Override
            public void run() {
                new CallBackDemo().runningAsync(new CallBack() {
                    @Override
                    public void pushData(String data) {
                        System.out.println("CallBack data: " + data);
                    }

                    @Override
                    public void pushComplete() {
                        System.out.println("CallBack done!!!");
                    }

                    @Override
                    public void pushError(Exception ex) {
                        System.out.println("CallBack Error called, Got an Exception:" + ex);
                    }
                });
            }
        };

        var t = new Thread(runnable);
        t.start();
        Thread.sleep(2000);

        System.out.println("Thread principal finalizou processamento!");
    }

    public void runningAsync(CallBack callBack) {

        System.out.println("Estou sendo executado em outra Thread");
        sleep(1000);

        callBack.pushData("Data 1");
        callBack.pushData("Data 2");
        callBack.pushData("Data 3");
        callBack.pushData("Data 4");

        callBack.pushError(new RuntimeException("Deu ruim!!!"));

        callBack.pushComplete();
    }

    private void sleep(int duration) {
        try {
            Thread.sleep(duration);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
