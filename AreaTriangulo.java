import java.util.Scanner;

public class AreaTriangulo {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double base;
        double altura;
        double area;

        System.out.println("Ingrese la base del triangulo:");
        base = sc.nextDouble();

        System.out.println("Ingrese la altura del triangulo:");
        altura = sc.nextDouble();

        area = (base * altura) / 2;

        System.out.println("El area del triangulo es: " + area);

    }
}
