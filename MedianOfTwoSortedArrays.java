public class MedianOfTwoSortedArrays {

    static double getMedian(int[] a, int[] b, int n) {
        int i = 0; 
        int j = 0; 
        int count;
        int m1 = -1, m2 = -1;

        for (count = 0; count <= n; count++) {

            if (i == n) {
                m1 = m2;
                m2 = b[0];
                break;
            }

            else if (j == n) {
                m1 = m2;
                m2 = a[0];
                break;
            }

            if (a[i] <= b[j]) {
                m1 = m2;
                m2 = a[i];
                i++;
            } else {
                m1 = m2;
                m2 = b[j];
                j++;
            }
        }

        return (m1 + m2) / 2.0;
    }

    public static void main(String[] args) {
        int[] a = {1, 12, 15, 26, 38};
        int[] b = {2, 13, 17, 30, 45};
        int n = a.length;

        System.out.println("Median = " + getMedian(a, b, n));  // Output: 16
    }
}
