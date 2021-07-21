package Clases;

public class Heroe extends Personajes implements Guerrero{

    private int vidaInicial;
    private int vidaTotal;

    public Heroe(){
        setNombre("Hesmont");
        setVida(100);
    }

    @Override
    public void modificarVida() {
        System.out.println("El heroe con una Armadura reforzada tiene +100 HP");
        vidaInicial = getVida();
        vidaTotal = vidaInicial + 100;
        setVida(vidaTotal);
    }


    @Override
    public void imprimirdatos() {

        modificarVida();
        super.imprimirdatos();
    }

    public void Atacar() {
        System.out.println(getNombre() + " ataca al objetivo y le ensesta un golpe con su mandoble pesado +150 de daño");
        System.out.println("-----------------------------------");
    }
}
