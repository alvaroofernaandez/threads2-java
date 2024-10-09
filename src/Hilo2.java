public class Hilo2 implements Runnable{
    static StringBuilder cadena = new StringBuilder();

    public Hilo2 () {}

    @Override
    public void run() {
        System.out.println("\nABECEDARIO\n");
        for (char c = 'A'; c<= 'Z'; c++) {
            System.out.println("Letra " + c);
            cadena.append(c);
        }
        System.out.println("El hilo 2 ha finalizado.\n");
    }

    public String getLetras() {
        return cadena.toString();
    }
}
