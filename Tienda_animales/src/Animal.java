import java.util.Scanner;

public class Animal {

    private Scanner teclado;
    private String nombre;
    private String especie;
    private String raza;
    private int edad;
    private int precio;

    public Animal() {
        teclado = new Scanner(System.in);

    }

    public String toString() {
        return "nombre: " + nombre + "\n" + "especie: " + especie + "\n" + "raza: " + raza + "\n" + "edad: " + edad + "\n" + "precio: " + precio;
    }

    public void cargaDelAnimal() {
        System.out.println("Introduce el nombre del animal");
        nombre = teclado.next();
        System.out.println("Introduce la especie");
        especie = teclado.next();
        System.out.println("Introduce la raza");
        raza = teclado.next();
        System.out.println("Introduce la edad");
        edad = teclado.nextInt();
        System.out.println("Introduce el precio");
        precio = teclado.nextInt();
    }



    public String getNombre() {
        return nombre;
    }

    public int dinero() {
        return precio;
    }
}