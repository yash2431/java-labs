import java.util.Scanner;

public class VowelCounter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] vowelCounts = new int[5]; 

        while (true) {
            System.out.print("Enter a sentence (or type 'quit' to exit): ");
            String sentence = scanner.nextLine().toLowerCase();

            if (sentence.equals("quit")) {
                break;
            }

            countVowels(sentence, vowelCounts);
        }

        System.out.println("Total counts of each vowel:");
        System.out.println("A: " + vowelCounts[0]);
        System.out.println("E: " + vowelCounts[1]);
        System.out.println("I: " + vowelCounts[2]);
        System.out.println("O: " + vowelCounts[3]);
        System.out.println("U: " + vowelCounts[4]);

        scanner.close();
    }

    public static void countVowels(String sentence, int[] vowelCounts) {
        for (char ch : sentence.toCharArray()) {
            switch (ch) {
                case 'a':
                    vowelCounts[0]++;
                    break;
                case 'e':
                    vowelCounts[1]++;
                    break;
                case 'i':
                    vowelCounts[2]++;
                    break;
                case 'o':
                    vowelCounts[3]++;
                    break;
                case 'u':
                    vowelCounts[4]++;
                    break;
            }
        }
    }
}
