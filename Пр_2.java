import java.util.Scanner;

public class task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите количество строк первой матрицы: ");
        int rowsA = scanner.nextInt();
        System.out.print("Введите количество столбцов первой матрицы: ");
        int colsA = scanner.nextInt();

        int[][] matrixA = new int[rowsA][colsA];
        System.out.println("Введите элементы первой матрицы:");
        for (int i = 0; i < rowsA; i++) {
            for (int j = 0; j < colsA; j++) {
                matrixA[i][j] = scanner.nextInt();
            }
        }

        System.out.print("Введите количество строк второй матрицы: ");
        int rowsB = scanner.nextInt();
        System.out.print("Введите количество столбцов второй матрицы: ");
        int colsB = scanner.nextInt();

        int[][] matrixB = new int[rowsB][colsB];
        System.out.println("Введите элементы второй матрицы:");
        for (int i = 0; i < rowsB; i++) {
            for (int j = 0; j < colsB; j++) {
                matrixB[i][j] = scanner.nextInt();
            }
        }

        if (colsA != rowsB) {
            System.out.println("Ошибка: количество столбцов первой матрицы не равно количеству строк второй!");
            return;
        }

        int[][] result = new int[rowsA][colsB];
        for (int i = 0; i < rowsA; i++) {
            for (int j = 0; j < colsB; j++) {
                for (int k = 0; k < colsA; k++) {
                    result[i][j] += matrixA[i][k] * matrixB[k][j];
                }
            }
        }

        System.out.println("Результат умножения:");
        for (int i = 0; i < rowsA; i++) {
            for (int j = 0; j < colsB; j++) {
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }
    }
}