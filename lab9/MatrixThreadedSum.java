import java.util.Scanner;

class RowSumThread extends Thread {
    private int[] row;
    private int sum;

    public RowSumThread(int[] row) {
        this.row = row;
        this.sum = 0;
    }

    public void run() {
        for (int num : row) {
            sum += num;
        }
    }

    public int getSum() {
        return sum;
    }
}

public class MatrixThreadedSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of rows (m): ");
        int m = scanner.nextInt();

        System.out.print("Enter the number of columns (n): ");
        int n = scanner.nextInt();

        int[][] matrix = new int[m][n];

        System.out.println("Enter the matrix elements:");
        for (int i = 0; i < m; i++) {
            System.out.println("Row " + (i + 1) + ":");
            for (int j = 0; j < n; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }

        RowSumThread[] threads = new RowSumThread[m];
        for (int i = 0; i < m; i++) {
            threads[i] = new RowSumThread(matrix[i]);
            threads[i].start();
        }


        try {
            for (RowSumThread thread : threads) {
                thread.join();
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Sum of elements in each row:");
        for (int i = 0; i < m; i++) {
            System.out.println("Row " + (i + 1) + ": " + threads[i].getSum());
        }

        scanner.close();
    }
}
