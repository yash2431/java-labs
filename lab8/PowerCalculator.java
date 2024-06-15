public class PowerCalculator {
    
    public static void main(String[] args) {
        if (args.length != 2) {
            System.out.println("Usage: java PowerCalculator <x> <y>");
            return;
        }

        try {
            int x = Integer.parseInt(args[0]);
            int y = Integer.parseInt(args[1]);
            int result = power(x, y);
            System.out.println(x + " raised to the power of " + y + " is: " + result);
        } catch (NumberFormatException e) {
            System.out.println("Invalid input. Please enter valid integers for x and y.");
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
    
    public static int power(int x, int y) {
        if (x == 0 && y == 0) {
            throw new IllegalArgumentException("Undefined: 0^0");
        }

        if (y < 0) {
            throw new IllegalArgumentException("Exponent should be non-negative.");
        }

        int result = 1;
        for (int i = 0; i < y; i++) {
            result *= x;
        }
        return result;
    }
}
