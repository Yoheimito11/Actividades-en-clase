/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ALUMNO
 */
public class EmpleadoPorHorasTrabajadas extends Empleado {

    private int horasTrabajadas;
    private double valorHoraOrdinaria;

    // Constructor
    public EmpleadoPorHorasTrabajadas(String nombre, String cargo, int horasTrabajadas,
                                      double valorHoraOrdinaria, HorasExtras horasExtras) {
        super(nombre, cargo, horasTrabajadas * valorHoraOrdinaria, horasExtras);
        this.horasTrabajadas = horasTrabajadas;
        this.valorHoraOrdinaria = valorHoraOrdinaria;
    }

    // Getters
    public int getHorasTrabajadas() {
        return horasTrabajadas;
    }

    public double getValorHoraOrdinaria() {
        return valorHoraOrdinaria;
    }

    // Sobrescribe el método calcularRetencion
    @Override
    public double calcularRetencion() {
        return 0;
    }
}
