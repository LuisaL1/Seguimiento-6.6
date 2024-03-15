import java.time.LocalDate;
import java.time.Period;

public class Employee extends Person {
    private LocalDate fechaIngreso;
    private double salario;

    public Employee(String name, String lastName, String gender, LocalDate birthdate, LocalDate fechaIngreso, double salario) {
        super(name, lastName, gender, birthdate);
        this.fechaIngreso = fechaIngreso;
        this.salario = salario;
    }

    public int calcularEdad() {
        return Period.between(birthdate, LocalDate.now()).getYears();
    }

    public int calcularAntiguedad() {
        return Period.between(fechaIngreso, LocalDate.now()).getYears();
    }

    public double calcularPrestaciones() {
        int antiguedad = calcularAntiguedad();
        return (antiguedad * salario) / 12;
    }

    @Override
    public void mostrarInformacion() {
        super.mostrarInformacion(); // Llama al método de la superclase
        System.out.println("Fecha de ingreso: " + fechaIngreso);
        System.out.println("Edad: " + calcularEdad() + " años");
        System.out.println("Antigüedad: " + calcularAntiguedad() + " años");
        System.out.println("Salario básico: $" + salario);
        System.out.println("Prestaciones: $" + calcularPrestaciones());
    }

    @Override
    public void showInformation() {
        System.out.println("Método showInformation implementado en Employee");
    }
}
