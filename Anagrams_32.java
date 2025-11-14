import java.util.Scanner;

public class Anagrams_32 {
    public static void main(String[] args) {

        String s1 = "geeks";
        String s2 = "kseeg";

        int n1 = s1.length() - 1;
        int n2 = s2.length() - 1;

        String newS1 = "";
        String newS2 = "";

        char arr1[] = new char[s1.length()];
        char arr2[] = new char[s2.length()];


        for (int i = 0; i < s1.length(); i++) {
            arr1[i] = s1.charAt(i);

        }

        for (int i = 0; i < arr1.length -1  ; i++) {
            for (int j = 0; j < arr1.length-i - 1 ; j++) {
                if (arr1[j] > arr1[j+1]) {
                    char temp = arr1[j];
                    arr1[j] = arr1[j+1];
                    arr1[j+1] = temp;
                }
            }
        }

        for (int i = 0; i < arr1.length; i++) {
            newS1 += arr1[i];

        }


        for (int i = 0; i < s2.length(); i++) {
            arr2[i] = s2.charAt(i);

        }

        for (int i = 0; i < arr2.length -1  ; i++) {
            for (int j = 0; j < arr2.length-i - 1 ; j++) {
                if (arr2[j] > arr2[j+1]) {
                    char temp = arr2[j];
                    arr2[j] = arr2[j+1];
                    arr2[j+1] = temp;
                }
            }
        }

        for (int i = 0; i < arr2.length; i++) {
            newS2 += arr2[i];

        }

        System.out.println(newS1.equals(newS2));
        System.out.println(newS1);
        System.out.println(newS2);

    }
}
