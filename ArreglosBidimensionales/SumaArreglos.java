import java.util.Scanner;
public class SumaArreglos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Tamaño de los arreglos");
        int tamañoMatriz = scanner.nextInt();

        while (tamañoMatriz <= 0) {
            System.out.println("el tamaño no puede ser menor o igual a cero");
            System.out.println("introduzca el tamaño otra vez");
            tamañoMatriz = scanner.nextInt();
        }

        int [] arreglo1 = new int[tamañoMatriz];
        int [] arreglo2 = new int[tamañoMatriz];
        int [] arreglosSuma = new int[tamañoMatriz];

        System.out.println("ingrese los valores del arreglo 1");
        for (int i = 0; i < tamañoMatriz; i++) {
            System.out.println("Arreglo 1 [ " + (i+1) + " ]");
            arreglo1[i] = scanner.nextInt();
            
        }
        System.out.println("ingrese los valores del arreglo 2");
        for (int i = 0; i < tamañoMatriz; i++) {
            System.out.println("Arreglo 2 [ " + (i+1) + " ]");
            arreglo2[i] = scanner.nextInt();
            
        }
        System.out.print("Arreglo 1 = [");
        for (int i = 0; i < tamañoMatriz; i++) {
            System.out.print(arreglo1[i] + ",");
        }
        System.out.print("]\n");

        System.out.print("Arreglo 2 = [");
        for (int i = 0; i < tamañoMatriz; i++) {
            System.out.print(arreglo2[i] + ",");
        }
        System.out.println("]\n");

        System.out.println("La suma de arreglo 1 y arreglo 2 es: ");
        System.out.print("[ ");
        for (int i = 0; i < tamañoMatriz; i++) {
            arreglosSuma[i] = arreglo1[i] + arreglo2[i];
             System.out.print(arreglosSuma[i] + ", ");
            
        }
        System.out.print("]");
    }
}
