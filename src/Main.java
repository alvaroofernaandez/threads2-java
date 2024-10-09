//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) throws InterruptedException {
        Hilo1 h1 = new Hilo1();
        Hilo2 h2 = new Hilo2();
        Hilo3 h3 = new Hilo3();

        Thread thread1 = new Thread(h1);
        Thread thread2 = new Thread(h2);
        Thread thread3 = new Thread(h3);

        thread1.start();
        thread1.join();
        thread2.start();
        thread2.join();
        thread3.start();
        thread3.join();
    }
}