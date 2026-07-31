public class EmpleadoTiempoCompleto extends Empleado {

    public static final double SALARIO_MINIMO = 1423500;

    
    public EmpleadoTiempoCompleto(String nombre, String cargo,
                                  double sueldoBase, HorasExtras horasExtras) {
        super(nombre, cargo, sueldoBase, horasExtras);
    }

    
    @Override
    public double calcularRetencion() {

        if (getSueldoBase() >= SALARIO_MINIMO) {
            return getSueldoBase() * 0.08;
        } else {
            return 0;
        }
    }
}
