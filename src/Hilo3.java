public class Hilo3 implements Runnable{
    static StringBuilder cadena = new StringBuilder();

    public Hilo3() {}

    @Override
    public void run() {
        System.out.println("\nABECEDARIO EN MINÚSCULA\n");
        for (char c='a'; c <= 'z'; c++) {
            System.out.println("Letra "+ c);
            cadena.append(c);
        }
        System.out.println("El hilo 3 ha finalizado.\n");
    }

    public String getLetras() {
        return cadena.toString();
    }
}
