import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class WordReplacement {
    public static void main(String[] args) {
        String inputFile = "file1.txt";
        String outputFile = "file2.txt";
        String wordToReplace = "word1";
        String replacementWord = "word2";

        try {
            int replacementCount = replaceWords(inputFile, outputFile, wordToReplace, replacementWord);
            System.out.println("Number of replacements: " + replacementCount);
        } catch (IOException e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }

    public static int replaceWords(String inputFile, String outputFile, String wordToReplace, String replacementWord) throws IOException {
        FileReader fileReader = new FileReader(inputFile);
        BufferedReader bufferedReader = new BufferedReader(fileReader);

        FileWriter fileWriter = new FileWriter(outputFile);
        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

        int replacementCount = 0;
        String line;
        while ((line = bufferedReader.readLine()) != null) {
            line = line.replaceAll(wordToReplace, replacementWord);
            bufferedWriter.write(line);
            bufferedWriter.newLine();
            replacementCount += countOccurrences(line, wordToReplace);
        }

        bufferedReader.close();
        bufferedWriter.close();

        return replacementCount;
    }

    public static int countOccurrences(String str, String word) {
        int count = 0;
        int idx = 0;
        while ((idx = str.indexOf(word, idx)) != -1) {
            count++;
            idx += word.length();
        }
        return count;
    }
}
