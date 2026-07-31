import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Nomina nomina = new Nomina();
        int opcion;

        do {
            System.out.println("\n===== SISTEMA DE NOMINA =====");
            System.out.println("1. Agregar empleado");
            System.out.println("2. Mostrar empleados");
            System.out.println("3. Buscar empleado");
            System.out.println("4. Eliminar empleado");
            System.out.println("5. Calcular nómina");
            System.out.println("6. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = sc.nextInt();
            sc.nextLine();

            switch (opcion) {

                case 1:

                    System.out.print("Nombre: ");
                    String nombre = sc.nextLine();

                    System.out.print("Cargo: ");
                    String cargo = sc.nextLine();

                    System.out.print("Sueldo base: ");
                    double sueldoBase = sc.nextDouble();

                    System.out.print("Cantidad de horas extras: ");
                    int horas = sc.nextInt();

                    System.out.print("Valor de cada hora extra: ");
                    double valorHora = sc.nextDouble();

                    HorasExtras horasExtras = new HorasExtras(horas, valorHora);

                    EmpleadoTiempoCompleto empleado = new EmpleadoTiempoCompleto(
                            nombre,
                            cargo,
                            sueldoBase,
                            horasExtras);

                    nomina.agregarEmpleado(empleado);

                    System.out.println("Empleado agregado correctamente.");
                    break;

                case 2:

                    nomina.mostrarEmpleados();
                    break;

                case 3:

                    System.out.print("Nombre del empleado: ");
                    nombre = sc.nextLine();

                    Empleado encontrado = nomina.buscarEmpleado(nombre);

                    if (encontrado != null) {
                        System.out.println("Nombre: " + encontrado.getNombre());
                        System.out.println("Cargo: " + encontrado.getCargo());
                        System.out.println("Sueldo Base: $" + encontrado.getSueldoBase());
                        System.out.println("Pago Horas Extras: $" + encontrado.calcularHorasExtras());
                        System.out.println("Salario Neto: $" + encontrado.calcularSalarioNeto());
                    } else {
                        System.out.println("Empleado no encontrado.");
                    }
                    break;

                case 4:

                    System.out.print("Nombre del empleado a eliminar: ");
                    nombre = sc.nextLine();

                    nomina.eliminarEmpleado(nombre);
                    break;

                case 5:

                    System.out.println("Total de la nomina: $" + nomina.calcularNomina());
                    break;

                case 6:

                    System.out.println("Gracias por usar el sistema.");
                    break;

                default:

                    System.out.println("Opción no válida.");
            }

        } while (opcion != 6);

        sc.close();
    }
}
