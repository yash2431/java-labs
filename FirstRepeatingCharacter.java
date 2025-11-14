import java.util.*;

public class FirstRepeatingCharacter {
    public static String firstRepChar(String s)
    {
        int n = s.length();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i; j++) {
                if (s.charAt(i) == s.charAt(j)) {
                    return Character.toString(s.charAt(i));
                }
            }
        }
        return "-1";
    }

    public static void main(String[] args)
    {
        String s = "geeksforgeeks";
        System.out.println(firstRepChar(s));
    }
}
