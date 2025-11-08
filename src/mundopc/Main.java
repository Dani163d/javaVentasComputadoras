package mundopc;

import mundopc.modelo.Computadora;
import mundopc.modelo.Monitor;
import mundopc.modelo.Raton;
import mundopc.modelo.Teclado;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //crear objetos
        Raton ratonLenovo = new Raton("bluetooth", "lenovo");
        System.out.println(ratonLenovo);
        Teclado tecladoLenovo = new Teclado("Bluetooth", "lenovo");
        System.out.println(tecladoLenovo);
        Monitor monitorLenovo = new Monitor("lenovo", 32);
        System.out.println(monitorLenovo);
        //creamos in pbjeto de tipo computadora
        Computadora computadoraLenovo =
                new Computadora("Computadora Lenovo", monitorLenovo, tecladoLenovo, ratonLenovo);
        System.out.println(computadoraLenovo);
    }
}