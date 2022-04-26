package PracticaMona;

public class Surftocat extends Octocat{
    public Surftocat(String nombre, String vestimenta, String accesorio) {
        super(nombre, vestimenta, accesorio);
    }

    public void actividad(){
        System.out.println(showMessage() + "\nSurfea en las mejores playas del mundo");
    }
}
