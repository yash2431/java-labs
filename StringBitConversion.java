public class StringBitConversion {
    public int myAtoi(String s) {
        int i = 0;
        int n = s.length();

        while (i < n && s.charAt(i) == ' ') {
            i++;
        }

        if (i == n) return 0;

        int sign = 1;
        if (s.charAt(i) == '+' || s.charAt(i) == '-') {
            if (s.charAt(i) == '-') sign = -1;
            i++;
        }

        long number = 0;

        while (i < n && s.charAt(i) == '0') {
            i++;
        }

        while (i < n && Character.isDigit(s.charAt(i))) {
            number = number * 10 + (s.charAt(i) - '0');

            if (sign == 1 && number > Integer.MAX_VALUE) {
                return Integer.MAX_VALUE;
            }
            if (sign == -1 && -number < Integer.MIN_VALUE) {
                return Integer.MIN_VALUE;
            }

            i++;
        }

        number *= sign;

        if (number > Integer.MAX_VALUE) return Integer.MAX_VALUE;
        if (number < Integer.MIN_VALUE) return Integer.MIN_VALUE;

        return (int) number;
    }

    public static void main(String[] args) {
        StringBitConversion ac = new StringBitConversion();
        int result = ac.myAtoi("-042");
        System.out.println(result);
    }
}
