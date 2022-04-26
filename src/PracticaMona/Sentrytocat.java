package PracticaMona;

public class Sentrytocat extends Octocat{

    public Sentrytocat(String nombre, String vestimenta, String accesorio) {
        super(nombre, vestimenta, accesorio);
    }

    public void actividad(){
        System.out.println(showMessage() + "\nExtingue incedios por el bien de la sociedad");
    }
}
