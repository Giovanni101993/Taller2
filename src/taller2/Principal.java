
public class Principal {

    public static void main(String[] args) {

        Hilo1 h1 = new Hilo1();

        Hilo2 h2 = new Hilo2();

        Hilo3 h3 = new Hilo3();

        h3.start();
       
        h1.start();
        try {
            h1.sleep(1000);
        } catch (Exception e) {
        }

        h2.start();
       
    }
}
