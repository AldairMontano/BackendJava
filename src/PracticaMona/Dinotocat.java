package PracticaMona;

public class Dinotocat extends Octocat{
    public Dinotocat(String nombre, String vestimenta, String accesorio) {
        super(nombre, vestimenta, accesorio);
    }

    public void actividad(){
        System.out.println(showMessage() + "\nLe gusta jugar disfrasado de dinosaurio");
    }
}
