import java.util.Arrays;
import java.util.Scanner;

public class Tienda {
    private Scanner teclado;
    private Animal animales[];
    private final static String compra = "compra";
    private final static String venta = "venta";
    private final static String indice = "indice";
    private final static String comprasTotales = "comprastotales";
    private int gastoTotalAnimalesComprados;
    private int ingresosTotalesAnimalesVendidos;

    public Tienda() {
        teclado = new Scanner(System.in);
        animales = new Animal[2];
    }

    public void operacionARealizar() {
        String realizar;
        int finalizar = 1;
        while (finalizar != 0) {
            System.out.println("Escribe la operacion que quieres realizar, compra, venta, comprastotales o indice");
            realizar = teclado.next();
            if (realizar.equals(compra)) {
                compraAnimal();
            }
            if (realizar.equals(venta)) {
                ventaAnimal();
            }
            if (realizar.equals(indice)) {
                indiceDeLosAnimales();
            }
            if (realizar.equals(comprasTotales)) {
                totalComprado();
            }
            System.out.println("Si quieres hacer otra operacion pulsa 1 si quieres salir pulsa 0");
            finalizar = teclado.nextInt();
        }

    }

    public void compraAnimal() {
        int contador = 0;
        animales[contador] = new Animal();
        animales[contador].cargaDelAnimal();
        contador++;
        if (contador == animales.length) {
            animales = Arrays.copyOf(animales, animales.length *2);
        }
    }

    public void ventaAnimal() {

    }

    public void totalComprado() {
        for (int f = 0; f < animales.length; f++) {
            gastoTotalAnimalesComprados = animales[f].dinero();

        }
        System.out.println(gastoTotalAnimalesComprados);
    }

    public void indiceDeLosAnimales() {
        System.out.println(animales.length);
        System.out.println(animales[0].toString());
        for (int f = 0; f < animales.length; f++) {

        }
    }

}
/**
 * TIENDA ANIMALES.
 * El problema planteado consiste en crear una clase que permita procesar la información de los Animal
 * que se encuentran en una veterinaria X. Suponga que los atributos básicos de un animal son:
 * tipo_animal, especie[raza] y edad.
 * compra
 * venta
 * totales compra y venta
 * Se debe implementar un método que imprima los datos de cada animal que se instancie
 * en la base de datos de la veterinaria.**/