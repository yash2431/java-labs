import java.util.Scanner;

public class BinaryToDecimal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a binary number (e.g. 101.110): ");
        String binary = sc.nextLine();
        double decimalValue = binaryToDecimal(binary);
        System.out.println("Decimal value: " + decimalValue);
    }

    public static double binaryToDecimal(String binary) {
        String[] parts = binary.split("\\.");
        String intPart = parts[0];
        String fracPart = (parts.length > 1) ? parts[1] : "";

        int intValue = Integer.parseInt(intPart, 2);

        double fracValue = 0;
        for (int i = 0; i < fracPart.length(); i++) {
            if (fracPart.charAt(i) == '1') {
                fracValue += Math.pow(2, -(i + 1));
            }
        }

        return intValue + fracValue;
    }
}
