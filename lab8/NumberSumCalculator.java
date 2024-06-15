import java.util.Scanner;

public class NumberSumCalculator {
    
    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("No numbers provided.");
            return;
        }

        int sum = 0;
        for (String arg : args) {
            try {
                int num = Integer.parseInt(arg);
                if (isValid(num)) {
                    sum += num;
                }
            } catch (NumberFormatException e) {
                System.out.println("Invalid input: " + arg);
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }

        System.out.println("Sum of valid numbers: " + sum);
    }
    
    public static boolean isValid(int num) throws Exception {
        if (num < 0) {
            throw new Exception("Negative number: " + num);
        }
        if (num % 10 == 0) {
            throw new Exception("Number evenly divisible by 10: " + num);
        }
        if (num > 1000 && num < 2000) {
            throw new Exception("Number between 1000 and 2000: " + num);
        }
        if (num > 7000) {
            throw new Exception("Number greater than 7000: " + num);
        }
        return true;
    }
}
