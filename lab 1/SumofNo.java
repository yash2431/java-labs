public class SumofNo {
    public static void main(String[] args) {
        if (args.length != 2) {
            System.out.println("Please provide exactly two command-line arguments as double numbers.");
            return;
        }
        
        try {
            double number1 = Double.parseDouble(args[0]);
            double number2 = Double.parseDouble(args[1]);
            
            double sum = number1 + number2;
            
            System.out.println("Sum of " + number1 + " and " + number2 + " is: " + sum);
        } catch (NumberFormatException e) {
            System.out.println("Invalid input. Please provide valid double numbers.");
        }
    }
}


//java SumOfNumbers 3.5 4.2
