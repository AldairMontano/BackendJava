package PracticaMona;

public class Boxertocat extends Octocat{
    public Boxertocat(String nombre, String vestimenta, String accesorio) {
        super(nombre, vestimenta, accesorio);
    }

    public void actividad(){
        System.out.println(showMessage() + "\nBoxea como un campeón");
    }
}
