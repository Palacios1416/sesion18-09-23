package src;
import java.util.Scanner;
public class ArrreglosBidimensionales {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    
    int[][] matrizB = {{1,2}, {3,4}};

    System.out.print("Ingrese la cantidad de filas: ");
        int cantFilas = scanner.nextInt();
    System.out.print("Ingrese la cantidad de columnas: ");
        int cantColumnas = scanner.nextInt();
    int[][] matrizA = new int[cantFilas][cantColumnas];
        System.out.println("Ingrese los elementos de la matriz: ");
        for (int i = 0; i < cantFilas; i++) {
            for (int j = 0; j < cantColumnas; j++) {
                System.out.print("Arreglo A [" + i + "," + j + "] = ");
                matrizA[i][j] = scanner.nextInt();
            }
        }
        System.out.println("Los datos en forma de matriz: ");
        for (int i = 0; i < matrizA.length; i++) {
            for (int j = 0; j < matrizA.length; j++) {
                System.out.print(matrizA[i][j] + "\t");
            }
            System.out.println();
        }




    }
}
