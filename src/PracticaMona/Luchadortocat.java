package PracticaMona;

public class Luchadortocat extends Octocat{

    public Luchadortocat(String nombre, String vestimenta, String accesorio) {
        super(nombre, vestimenta, accesorio);
    }

    public void actividad(){
        System.out.println(showMessage() + "\nLe gusta Luchar en la AAA");
    }
}
