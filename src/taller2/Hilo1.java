
public class Hilo1 extends Thread {

    @Override
    public void run() {
        System.out.println("Tabla de multiplicar del 7");

        for (int i = 1; i <= 10; i++) {
            System.out.println("7 x " + i + " = " + 7 * i);
        }
        System.out.println(" ");
    }

}
