package mundopc;

import mundopc.modelo.Computadora;
import mundopc.modelo.Monitor;
import mundopc.modelo.Raton;
import mundopc.modelo.Teclado;
import mundopc.servicio.Orden;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class javaVentasComputadoras {
    public static void main(String[] args) {
        //crear objetos
        Raton ratonLenovo = new Raton("bluetooth", "lenovo");
        // System.out.println(ratonLenovo);
        Teclado tecladoLenovo = new Teclado("Bluetooth", "lenovo");
        // System.out.println(tecladoLenovo);
        Monitor monitorLenovo = new Monitor("lenovo", 32);
        // System.out.println(monitorLenovo);
        //creamos in pbjeto de tipo computadora
        Computadora computadoraLenovo =
                new Computadora("Computadora Lenovo", monitorLenovo, tecladoLenovo, ratonLenovo);
        // System.out.println(computadoraLenovo);

        //objeto conputadora
        Monitor monitorDell = new Monitor("Dell", 28);
        Teclado tecladoDell = new Teclado("USB", "Dell");
        Raton ratonDell = new Raton("USB","Dell");
        Computadora computadoraDell = new Computadora("Computadora Del", monitorDell, tecladoDell, ratonDell);


        //creamos una orden
        Orden orden1 = new Orden();
        orden1.agregarComputadora(computadoraLenovo);
        orden1.agregarComputadora(computadoraDell);
        orden1.mostrarOrden();
    }
}