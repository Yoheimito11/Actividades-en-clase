import java.util.ArrayList;

public class Nomina {

    private ArrayList<Empleado> empleados;

    
    public Nomina() {
        empleados = new ArrayList<>();
    }

    
    public void agregarEmpleado(Empleado empleado) {
        empleados.add(empleado);
    }

    
    public void mostrarEmpleados() {

        if (empleados.isEmpty()) {
            System.out.println("No hay empleados registrados.");
            return;
        }

        for (Empleado e : empleados) {
            System.out.println("Nombre: " + e.getNombre());
            System.out.println("Cargo: " + e.getCargo());
            System.out.println("Sueldo Base: $" + e.getSueldoBase());
            System.out.println("Pago Horas Extras: $" + e.calcularHorasExtras());
            System.out.println("Salario Neto: $" + e.calcularSalarioNeto());
            System.out.println("-----------------------------------");
        }
    }

    
    public Empleado buscarEmpleado(String nombre) {

        for (Empleado e : empleados) {
            if (e.getNombre().equalsIgnoreCase(nombre)) {
                return e;
            }
        }

        return null;
    }

    
    public void eliminarEmpleado(String nombre) {

        Empleado empleado = buscarEmpleado(nombre);

        if (empleado != null) {
            empleados.remove(empleado);
            System.out.println("Empleado eliminado correctamente.");
        } else {
            System.out.println("Empleado no encontrado.");
        }
    }

    
    public double calcularNomina() {

        double total = 0;

        for (Empleado e : empleados) {
            total += e.calcularSalarioNeto();
        }

        return total;
    }
}
