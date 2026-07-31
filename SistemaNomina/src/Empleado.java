public class Empleado {

    private String nombre;
    private String cargo;
    private double sueldoBase;
    private HorasExtras horasExtras;

    
    public Empleado(String nombre, String cargo, double sueldoBase, HorasExtras horasExtras) {
        this.nombre = nombre;
        this.cargo = cargo;
        this.sueldoBase = sueldoBase;
        this.horasExtras = horasExtras;
    }

    public String getNombre() {
        return nombre;
    }

    public String getCargo() {
        return cargo;
    }

    public double getSueldoBase() {
        return sueldoBase;
    }

    public HorasExtras getHorasExtras() {
        return horasExtras;
    }

    
    public double calcularHorasExtras() {
        return horasExtras.calcularPago();
    }

    public double calcularRetencion() {
        return 0;
    }

    public double calcularSeguridad() {
        return sueldoBase * 0.08;
    }

    public double calcularDescuentoTotal() {
        return calcularRetencion() + calcularSeguridad();
    }

    public double calcularSalarioNeto() {
        return sueldoBase + calcularHorasExtras() - calcularDescuentoTotal();
    }
}
