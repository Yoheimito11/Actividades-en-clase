import java.util.Scanner;

abstract class TransporteTerrestre {
    private String tipoDocumento;
    private String documento;
    private String nombre;
    private int edad;
    private String origen;
    private String destino;
    private double duracion;
    private double costoBase;

    public TransporteTerrestre(String tipoDocumento, String documento, String nombre,
                                int edad, String origen, String destino,
                                double duracion, double costoBase) {
        this.tipoDocumento = tipoDocumento;
        this.documento = documento;
        this.nombre = nombre;
        this.edad = edad;
        this.origen = origen;
        this.destino = destino;
        this.duracion = duracion;
        this.costoBase = costoBase;
    }

    public double getCostoBase() { return costoBase; }

    public abstract double calcularCostoFinal();
    public abstract String getTipoVehiculo();

    public void imprimirInfo() {
        System.out.println("\n========== INFORMACIÓN DEL VIAJE ==========");
        System.out.println("Tipo de documento : " + tipoDocumento);
        System.out.println("Documento         : " + documento);
        System.out.println("Nombre            : " + nombre);
        System.out.println("Edad              : " + edad);
        System.out.println("Origen            : " + origen);
        System.out.println("Destino           : " + destino);
        System.out.println("Duración          : " + duracion + " horas");
        System.out.println("Tipo de vehículo  : " + getTipoVehiculo());
        System.out.println("Costo base        : $" + costoBase);
        System.out.println("Costo final       : $" + calcularCostoFinal());
        System.out.println("===========================================\n");
    }
}

class Bus extends TransporteTerrestre {
    public Bus(String tipoDoc, String doc, String nombre, int edad,
               String origen, String destino, double duracion, double costo) {
        super(tipoDoc, doc, nombre, edad, origen, destino, duracion, costo);
    }
    public double calcularCostoFinal() { return getCostoBase(); }
    public String getTipoVehiculo() { return "Bus (sin recargo)"; }
}

class Minibus extends TransporteTerrestre {
    public Minibus(String tipoDoc, String doc, String nombre, int edad,
                   String origen, String destino, double duracion, double costo) {
        super(tipoDoc, doc, nombre, edad, origen, destino, duracion, costo);
    }
    public double calcularCostoFinal() { return getCostoBase() * 1.20; }
    public String getTipoVehiculo() { return "Minibus (recargo 20%)"; }
}

class Coche extends TransporteTerrestre {
    public Coche(String tipoDoc, String doc, String nombre, int edad,
                 String origen, String destino, double duracion, double costo) {
        super(tipoDoc, doc, nombre, edad, origen, destino, duracion, costo);
    }
    public double calcularCostoFinal() { return getCostoBase() * 1.35; }
    public String getTipoVehiculo() { return "Coche (recargo 35%)"; }
}

public class SistemaTransporte {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean continuar = true;

        while (continuar) {
            System.out.println("=== SISTEMA DE TRANSPORTE TERRESTRE ===");
            System.out.println("1. Bus");
            System.out.println("2. Minibus");
            System.out.println("3. Coche");
            System.out.println("0. Salir");
            System.out.print("Opción: ");
            int opcion = sc.nextInt();
            sc.nextLine();

            if (opcion == 0) {
                continuar = false;
                System.out.println("Programa cerrado.");
                break;
            }

            System.out.print("Tipo de documento: ");
            String tipoDoc = sc.nextLine();
            System.out.print("Número de documento: ");
            String doc = sc.nextLine();
            System.out.print("Nombre: ");
            String nombre = sc.nextLine();
            System.out.print("Edad: ");
            int edad = sc.nextInt(); sc.nextLine();
            System.out.print("Origen: ");
            String origen = sc.nextLine();
            System.out.print("Destino: ");
            String destino = sc.nextLine();
            System.out.print("Duración (horas): ");
            double duracion = sc.nextDouble();
            System.out.print("Costo base: ");
            double costo = sc.nextDouble(); sc.nextLine();

            TransporteTerrestre viaje;

            if (opcion == 1) {
                viaje = new Bus(tipoDoc, doc, nombre, edad, origen, destino, duracion, costo);
            } else if (opcion == 2) {
                viaje = new Minibus(tipoDoc, doc, nombre, edad, origen, destino, duracion, costo);
            } else {
                viaje = new Coche(tipoDoc, doc, nombre, edad, origen, destino, duracion, costo);
            }

            viaje.imprimirInfo();
        }

        
    }
}
