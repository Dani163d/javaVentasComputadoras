package mundopc.modelo;

public class Raton extends DispositivoEntrada{
    private final int idRaton;
    private static  int contadorRatones;

    //contructor
    public  Raton(String tipoDeEntrada, String marca){
        super(tipoDeEntrada, marca);
        idRaton = ++ contadorRatones;
    }

    @Override
    public String toString() {
        return "raton{" +
                "idRaton=" + idRaton +
                " } " + super.toString();
    }
}
