import java.util.Scanner;

public class Function{
    public int checkArray(int[] A) {
        for (int i = 1; i < A.length; i++) {
            if (A[i] < A[i - 1]) {
                return 0;
            }
        }
        int last = A[A.length - 1];
        int count = 0;
        for (int n : A) {
            if (n == last) count++;
        }
        return (count >= 3) ? 1 : 0;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array: ");
        int size = sc.nextInt();
        int[] array = new int[size];
        System.out.println("Enter the elements:");
        for (int i = 0; i < size; i++) {
            array[i] = sc.nextInt();
        }
        Function check = new Function();
        int result = check.checkArray(array);
        System.out.println(result);
    }
}
