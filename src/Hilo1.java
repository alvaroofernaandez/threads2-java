public class Hilo1 implements Runnable {
    static StringBuilder cadena = new StringBuilder();

    public Hilo1() {}

    @Override
    public void run() {
        System.out.println("NUMEROS\n");
        for(int i = 1; i <= 30; i++ ) {
            System.out.println("Número " + i);
            cadena.append(i);
        }

        System.out.println("El hilo 1 ha finalizado.\n");
    }

    public String getNumeros() {
        return cadena.toString();
    }
}
