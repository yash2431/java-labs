public class Search {
    public static void main(String[] args) {
        for (String arg : args) {
            if (arg.isEmpty() || !Character.isUpperCase(arg.charAt(0))) {
                System.out.println("Error: Argument '" + arg + "' does not begin with an uppercase letter.");
                System.exit(1);
            }
        }
        
        System.out.println("All arguments begin with an uppercase letter.");
    }
}


//java ArgumentSearch Hello World Java