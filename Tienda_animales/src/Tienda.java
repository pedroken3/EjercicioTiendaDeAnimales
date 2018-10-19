import java.util.Arrays;
import java.util.Scanner;

public class Tienda {
    private Scanner teclado;
    private Animal animales[];
    private final static String compra = "compra";
    private final static String venta = "venta";
    private final static String indice = "indice";
    private final static String comprasTotales = "comprastotales";
    private final static String ventasTotales = "ventastotales";
    private int gastoTotalAnimalesComprados;
    private int ingresosTotalesAnimalesVendidos;
    private int contador = 0;

    public Tienda() {
        teclado = new Scanner(System.in);
        animales = new Animal[0];
    }

    public void operacionARealizar() {
        String realizar;
        int finalizar = 1;
        while (finalizar != 0) {
            System.out.println("Escribe la operacion que quieres realizar, compra, venta, comprastotales, ventastotales o indice");
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
            if (realizar.equals(ventasTotales)) {
                totalVendido();
            }
            System.out.println("Si quieres hacer otra operacion pulsa 1 si quieres salir pulsa 0");
            finalizar = teclado.nextInt();
        }

    }

    public void compraAnimal() {
        System.out.println(animales.length);
        if (contador == animales.length) {
            animales = Arrays.copyOf(animales, animales.length + 1);
        }
        System.out.println(animales.length);
        animales[contador] = new Animal();
        animales[contador].cargaDelAnimal();
        gastoTotalAnimalesComprados += animales[contador].dinero();
        contador++;

    }

    public void ventaAnimal() {
        String animalAVender = "";
        System.out.println("Introduce el nombre del animal a vender");
        animalAVender = teclado.next();

        for (int f = 0; f < animales.length; f++) {
            System.out.println("nombre del animal a vender: " + animalAVender);
            System.out.println("nombre del animal a comparar: " + animales[f].getNombre());
            if (animalAVender.equals(animales[f].getNombre())) {
                ingresosTotalesAnimalesVendidos += animales[f].dinero();
                for (int c = f; c < animales.length - 1; c++) {

                    animales[c] = animales[c + 1];

                }
                animales = Arrays.copyOf(animales, animales.length - 1);
                break;
                //operacionARealizar();
            }
        }

    }

    public void totalComprado() {
        System.out.println(gastoTotalAnimalesComprados);
    }

    public void totalVendido() {
        System.out.println(ingresosTotalesAnimalesVendidos);
    }

    public void indiceDeLosAnimales() {
        System.out.println(animales.length);

        for (int f = 0; f < animales.length; f++) {
            System.out.println(animales[f].toString());
            System.out.println();
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
 * en la base de datos de la veterinaria.
 **/