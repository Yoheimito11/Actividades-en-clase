public class HorasExtras {

    private int horas;
    private double valorHora;

    
    public HorasExtras(int horas, double valorHora) {
        this.horas = horas;
        this.valorHora = valorHora;
    }

   
    public int getHoras() {
        return horas;
    }

    public double getValorHora() {
        return valorHora;
    }

    
    public double calcularPago() {
        return horas * valorHora;
    }
}
