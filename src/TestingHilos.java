import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TestingHilos {

    @Test
    public void TestH1() throws Exception {
        Hilo1 h1 = new Hilo1();
        Thread thread1 = new Thread(h1);
        
        thread1.start();
        thread1.join();
        
        assertEquals("123456789101112131415161718192021222324252627282930", h1.getNumeros());
    }

    @Test
    public void TestH2() throws Exception {
        Hilo2 h2 = new Hilo2();
        Thread thread2 = new Thread(h2);
        
        thread2.start();
        thread2.join();

        assertEquals("ABCDEFGHIJKLMNOPQRSTUVWXYZ", h2.getLetras());
    }

    @Test
    public void TestH3() throws Exception {
        Hilo3 h3 = new Hilo3();
        Thread thread3 = new Thread(h3);

        thread3.start();
        thread3.join();

        assertEquals("abcdefghijklmnopqrstuvwxyz", h3.getLetras());
    }
}
