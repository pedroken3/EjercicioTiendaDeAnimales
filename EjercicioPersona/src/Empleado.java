import java.util.Scanner;

public class Empleado extends Persona{
    private Scanner teclado;
    private int sueldo;
    private Persona empleado;

    public Empleado() {
        teclado = new Scanner(System.in);
        empleado = new Persona();
        empleado.cargarDatos();
    }

    public void cagarSueldo() {
        System.out.println("Introduce el sueldo del empleado:");
        sueldo = teclado.nextInt();
    }

    public void ImprimirEmpleadoYSueldo() {
        empleado.imprimirDatosPersona();
        System.out.println("Y su sueldo es de: " + sueldo);
    }

    public static void main(String[] args) {
        Empleado empleado = new Empleado();
        empleado.cagarSueldo();
        empleado.ImprimirEmpleadoYSueldo();
    }
}
