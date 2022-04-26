package PracticaMona;

public class Octocat {
    private String nombre, vestimenta, accesorio;

    public Octocat(String nombre, String vestimenta, String accesorio){
        this.nombre = nombre;
        this.vestimenta = vestimenta;
        this.accesorio = accesorio;

    }

    public String getNombre() {  return nombre;  }
    public String getVestimenta() {  return vestimenta;  }
    public String getAccesorio() {  return accesorio;  }

    public boolean setNombre(String nombre){
        if(!nombre.isEmpty()){
            this.nombre = nombre;
            return true;
        } else
            return false;
    }

    public boolean setVestimenta(String vestimenta){
        if(!vestimenta.isEmpty()){
            this.vestimenta = vestimenta;
            return true;
        } else
            return false;
    }

    public boolean setAccesorios(String accesorio){
        if(!accesorio.isEmpty()){
            this.accesorio = accesorio;
            return true;
        } else
            return false;
    }

    public String showMessage(){
        return
                "Nombre: " + nombre +
                        "\nVestimenta: " + vestimenta +
                        "\nAccesorios: " + accesorio;
    }

}
