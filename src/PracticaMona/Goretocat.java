package PracticaMona;

public class Goretocat extends Octocat{

    public Goretocat(String nombre, String vestimenta, String accesorio) {
        super(nombre, vestimenta, accesorio);
    }

    public void actividad(){

        System.out.println(showMessage() + "\nLe gusta Jugar Americano");
    }
}
