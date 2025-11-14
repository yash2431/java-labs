import java.util.Scanner;

public class Solution {
    public boolean checkPossibility(int[] nums) {
        int violations = 0;

        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] > nums[i + 1]) {
                violations++;

                if (violations > 1) {
                    return false;
                }
                if (i > 0 && nums[i - 1] > nums[i + 1]) {
                    nums[i + 1] = nums[i]; 
                } else {
                    nums[i] = nums[i + 1]; 
                }
            }
        }

        return true;
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
        Solution check = new Solution();
        boolean result = check.checkPossibility(array);
        System.out.println(result);
    }
}
