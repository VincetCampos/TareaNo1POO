package Clases;

public abstract class Personajes {

    private static String Nombre;
    private static int Vida;

    public static void setNombre(String nombre) {
        Nombre = nombre;
    }

    public static String getNombre() {
        return Nombre;
    }

    public static void setVida(int vida) {
        Vida = vida;
    }

    public static int getVida() {
        return Vida;
    }

    public Personajes() {
    }

    public abstract void modificarVida();


    public void imprimirdatos(){

        System.out.println("Nombre " + Nombre);
        System.out.println("Vida " + Vida + " HP");

    }
}
