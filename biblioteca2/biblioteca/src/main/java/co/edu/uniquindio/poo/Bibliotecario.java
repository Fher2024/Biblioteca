package co.edu.uniquindio.poo;

import java.time.LocalDate;
import java.util.Collection;
import java.util.LinkedList;
/*
 * Clase para obtener datos del bibliotecario junto a su salario
 */
public class Bibliotecario extends Persona {

    private double salario;
    private LocalDate fechaIngreso;
    private Collection<Prestamo> prestamos;

    public Bibliotecario(String nombre, String cedula, String correo, int telefono, double salario, LocalDate fechaIngreso) {
        super(nombre, cedula, correo, telefono);
        this.salario = salario;
        this.fechaIngreso = fechaIngreso;
        prestamos = new LinkedList<>();
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public LocalDate getFechaIngreso() {
        return fechaIngreso;
    }

    public void setFechaIngreso(LocalDate fechaIngreso) {
        this.fechaIngreso = fechaIngreso;
    }

    public Collection<Prestamo> getPrestamos() {
        return prestamos;
    }

    public void setPrestamos(Collection<Prestamo> prestamos) {
        this.prestamos = prestamos;
    }

    @Override
    public String toString() {
        return "Bibliotecario [salario=" + salario + ", fechaIngreso=" + fechaIngreso + ", prestamos=" + prestamos
                + "]";
    }

    public void add(Bibliotecario bibliotecario) {
        throw new UnsupportedOperationException("Unimplemented method 'add'");
    }

     /*
   * Método que permite calcular la bonificacion del bibliotecario
   */
    public double calcularBonificacion(){
        int anosAntiguedad = LocalDate.now().getYear() - fechaIngreso.getYear();
        return salario * 0.02 * anosAntiguedad;

    }

}
