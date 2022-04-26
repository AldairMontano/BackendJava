package PracticaMona;

public class TestOctocat {
    public static void main(String[] args) {
        show();
    }

    public static void show(){
        Goretocat qb = new Goretocat(
                "Goretocat",
                "Uniforme de americano",
                "Balón de americano");

        Luchadortocat luchador = new Luchadortocat(
                "Luchadortocat",
                "Traje de luchador",
                "Mascara de luchador");

        Sentrytocat bombero = new Sentrytocat(
                "Sentrytocat",
                "Traje de bombero",
                "Manguera"
        );

        Surftocat surfista = new Surftocat(
                "Surftocat",
                "Traje de baño",
                "Tabla de Surf"
        );

        Dinotocat dino = new Dinotocat(
                "Dinotocat",
                "Disfras de dinosaurio",
                "Juguetes"
        );

        Boxertocat boxeador = new Boxertocat(
                "Boxertocat",
                "Banda de entrenamiento",
                "Guantes de box"
        );

        qb.actividad();
        System.out.println("\n\n");
        luchador.actividad();
        System.out.println("\n\n");
        bombero.actividad();
        System.out.println("\n\n");
        surfista.actividad();
        System.out.println("\n\n");
        dino.actividad();
        System.out.println("\n\n");
        boxeador.actividad();
        System.out.println("\n\n");

    }
}
