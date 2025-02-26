import java.util.Random;
import java.util.Scanner;

public class MatrixOperations {
    // Константи для діапазону рандомних чисел
    private static final int MIN_RANDOM = 0;
    private static final int MAX_RANDOM = 100;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Введення розмірів матриці
        System.out.print("Введіть ширину матриці (не більше 20): ");
        int width = scanner.nextInt();
        System.out.print("Введіть висоту матриці (не більше 20): ");
        int height = scanner.nextInt();

        if (width > 20 || height > 20) {
            System.out.println("Розміри матриці не можуть перевищувати 20 на 20.");
            return;
        }

        // Вибір способу створення матриці
        System.out.print("Виберіть спосіб створення матриці (1 - вручну, 2 - рандомно): ");
        int choice = scanner.nextInt();

        int[][] matrix = new int[height][width];

        if (choice == 1) {
            fillMatrixManually(matrix, scanner);
        } else if (choice == 2) {
            fillMatrixRandomly(matrix);
        } else {
            System.out.println("Невірний вибір.");
            return;
        }

        // Виведення матриці
        printMatrix(matrix);

        // Пошук мінімального та максимального елементів
        int min = findMin(matrix);
        int max = findMax(matrix);
        System.out.println("Мінімальний елемент: " + min);
        System.out.println("Максимальний елемент: " + max);

        // Розрахунок середнього арифметичного
        double average = calculateAverage(matrix);
        System.out.println("Середнє арифметичне: " + average);

        // Розрахунок середнього геометричного
        double geometricMean = calculateGeometricMean(matrix);
        System.out.println("Середнє геометричне: " + geometricMean);
    }

    // Метод для заповнення матриці вручну
    private static void fillMatrixManually(int[][] matrix, Scanner scanner) {
        System.out.println("Введіть елементи матриці:");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }
    }

    // Метод для заповнення матриці рандомними числами
    private static void fillMatrixRandomly(int[][] matrix) {
        Random random = new Random();
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = MIN_RANDOM + random.nextInt(MAX_RANDOM - MIN_RANDOM + 1);
            }
        }
    }

    // Метод для виведення матриці
    private static void printMatrix(int[][] matrix) {
        System.out.println("Матриця:");
        for (int[] row : matrix) {
            for (int element : row) {
                System.out.print(element + " ");
            }
            System.out.println();
        }
    }

    // Метод для пошуку мінімального елемента
    private static int findMin(int[][] matrix) {
        int min = Integer.MAX_VALUE;
        for (int[] row : matrix) {
            for (int element : row) {
                if (element < min) {
                    min = element;
                }
            }
        }
        return min;
    }

    // Метод для пошуку максимального елемента
    private static int findMax(int[][] matrix) {
        int max = Integer.MIN_VALUE;
        for (int[] row : matrix) {
            for (int element : row) {
                if (element > max) {
                    max = element;
                }
            }
        }
        return max;
    }

    // Метод для розрахунку середнього арифметичного
    private static double calculateAverage(int[][] matrix) {
        int sum = 0;
        int count = 0;
        for (int[] row : matrix) {
            for (int element : row) {
                sum += element;
                count++;
            }
        }
        return (double) sum / count;
    }

    // Метод для розрахунку середнього геометричного
    private static double calculateGeometricMean(int[][] matrix) {
        double product = 1.0;
        int count = 0;
        for (int[] row : matrix) {
            for (int element : row) {
                product *= element;
                count++;
            }
        }
        return Math.pow(product, 1.0 / count);
    }
}