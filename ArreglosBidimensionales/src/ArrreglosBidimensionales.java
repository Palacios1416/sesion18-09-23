package src;
import java.util.Scanner;
public class ArrreglosBidimensionales {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    
    int[][] matrizB = {{1,2}, {3,4}};

    System.out.println("Ingrese la cantidad de filas: ");
        int cantFilas = scanner.nextInt();
    System.out.println("Ingrese la cantidad de columnas: ");
        int cantColumnas = scanner.nextInt();
    int[][] matrizA = new int[cantFilas][cantColumnas];
        System.out.println("Ingrese los elemntos de la matriz: ");
        for (int i = 0; i < cantFilas; i++) {
            for (int j = 0; j < cantColumnas; j++) {
                System.out.print("Arreglo A [" + i + "," + j + "]");

            }
        }






    }
}
