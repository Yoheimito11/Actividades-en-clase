import java.util.Scanner;

public class PuntajePostulante {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int correctas, incorrectas, blanco;
        int puntajeFinal;

        System.out.print("Ingrese el numero de respuestas correctas: ");
        correctas = sc.nextInt();

        System.out.print("Ingrese el numero de respuestas incorrectas: ");
        incorrectas = sc.nextInt();

        System.out.print("Ingrese el numero de respuestas en blanco: ");
        blanco = sc.nextInt();

        
        puntajeFinal = (correctas * 4) + (incorrectas * -1) + (blanco * 0);

        
        System.out.println("El puntaje final del postulante es: " + puntajeFinal);

        
    }
}
