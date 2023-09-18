import java.util.Scanner;
public class SumaArreglos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Tamaño de los arreglos");
        int tamañoMatriz = scanner.nextInt();
        int [] arreglo1 = new int[tamañoMatriz];
        int [] arreglo2 = new int[tamañoMatriz];
        int [] arreglosSuma = new int[tamañoMatriz];

        System.out.println("ingrese los valores del arreglo 1");
        for (int i = 0; i < tamañoMatriz; i++) {
            System.out.println("Arreglo 1 [ " + (i+1) + " ]");
            arreglo1[i] = scanner.nextInt();
        }
        for (int i = 0; i < tamañoMatriz; i++) {
            System.out.println("Arreglo 2 [ " + (i+1) + " ]");
            arreglo2[i] = scanner.nextInt();
        }

        System.out.println("La suma de arreglo 1 y arreglo 2 es: ");
        for (int i = 0; i < tamañoMatriz; i++) {
            System.out.println("Arreglo 2 [ " + (i+1) + " ]");
            arreglo2[i] = scanner.nextInt();
        }
    }
}
