package Clases;

public class Elfo extends Personajes implements Guerrero{
    private int vidaInicial;
    private int vidaFinal;

    public Elfo(){
        setNombre("Link");
        setVida(100);
    }

    @Override
    public void modificarVida() {
        System.out.println("El elfo con el escudo Hyliano tiene +50 HP");
        vidaInicial = getVida();
        vidaFinal = vidaInicial + 50;
        setVida(vidaFinal);
    }

    @Override
    public void imprimirdatos() {
        modificarVida();
        super.imprimirdatos();
    }

    public void Atacar() {
        System.out.println(getNombre() + " ataca con la espada maestra acierta y provoca 50 de daño " +
                "\n y usa el arco ancestral acierta y provoca 75 de daño");
        System.out.println("-----------------------------------");
    }
}
