package Clases;

public class Aldeano extends Personajes{

    public Aldeano(){
        setNombre("NPC Carlitos");
        setVida(100);
    }

    public void modificarVida() {
        System.out.println("El aldeano no tiene ningun modificador");
    }

    @Override
    public void imprimirdatos() {

        modificarVida();
        super.imprimirdatos();
        System.out.println("-----------------------------------");
    }
}
