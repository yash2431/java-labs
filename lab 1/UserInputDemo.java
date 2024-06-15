public class UserInputDemo {
    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("Please provide a command-line argument.");
            return;
        }
        
        String userInput = args[0];
        
        System.out.println("You entered: " + userInput);
    }
}


//java UserInputExample argument1
