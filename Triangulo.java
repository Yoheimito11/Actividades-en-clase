import java.util.Scanner;

class Triangulo {

    Scanner sc = new Scanner(System.in);

    private double base;
    private double altura;
    private double area;

    public void setBase() {
        System.out.println("Ingrese la base:");
        base = sc.nextDouble();
    }

    public void setAltura() {
        System.out.println("Ingrese la altura:");
        altura = sc.nextDouble();
    }

    public void calcularArea() {
        area = (base * altura) / 2;
    }

    public double getArea() {
        return area;
    }
}

public class Main {

    public static void main(String[] args) {

        Triangulo triangulo = new Triangulo();

        triangulo.setBase();
        triangulo.setAltura();
        triangulo.calcularArea();

        System.out.println("Area del triangulo: " + triangulo.getArea());

    }
}
