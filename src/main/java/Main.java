import javax.swing.*;
import java.time.LocalDate;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Information> empleados = new ArrayList<>();

        String name = JOptionPane.showInputDialog("Ingrese su nombre");
        String lastName = JOptionPane.showInputDialog("Ingrese su apellido");
        String gender = JOptionPane.showInputDialog("Ingrese su género");
        String birthdateStr = JOptionPane.showInputDialog("Ingrese su fecha de nacimiento (formato: YYYY-MM-DD)");
        LocalDate birthdate = LocalDate.parse(birthdateStr);

        String fechaIngresoStr = JOptionPane.showInputDialog("Ingrese su fecha de ingreso (formato: YYYY-MM-DD)");
        LocalDate fechaIngreso = LocalDate.parse(fechaIngresoStr);

        String salarioStr = JOptionPane.showInputDialog("Ingrese su salario");
        double salario = Double.parseDouble(salarioStr);

        Employee empleado1 = new Employee(name, lastName, gender, birthdate, fechaIngreso, salario);
        empleados.add(empleado1);

        for (Information empleado : empleados) {
            empleado.mostrarInformacion();
        }
    }
}
