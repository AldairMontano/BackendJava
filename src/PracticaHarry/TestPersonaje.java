package PracticaHarry;

public class TestPersonaje {
    public static void main(String[] args) {
        show();
    }

    public static void show (){
        Personajes snape = new Personajes("Severus Snape", "Slytherin",
                "Masculino", "Lord Voldemort", "Cierva");

        Personajes hermione = new Personajes("Hermione Granger","Gryffindor",
                "Femenino", "La profesora McGonagall diciéndole que reprobó todo", "Nutria");

        Personajes sirius = new Personajes("Sirius Black","Gryffindor",
                "Masculino","Desconocido","Perro");

        Personajes neville = new Personajes("Neville Longbottom","Gryffindor",
                "Masculino","Severus Snape","No corpóreo");

        Personajes cho = new Personajes("Cho Chang","Ravenclaw",
                "Femenino","Perder a la persona que ama","Cisne");

        System.out.println(snape.showMessage()+ "\n\n" + hermione.showMessage() + "\n\n" +
                sirius.showMessage() + "\n\n" + neville.showMessage() + "\n\n" + cho.showMessage());
    }
}
