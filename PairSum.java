import java.util.HashMap;

public class PairSum {
    public static int countPairs(int[] arr, int K) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int count = 0;

        for (int num : arr) {
            int complement = K - num;
            if (map.containsKey(complement)) {
                count += map.get(complement);
            }
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        return count;
    }

    public static void main(String[] args) {
        int[] arr = {1, 5, 7, 1};
        int K = 6;
        System.out.println(countPairs(arr, K));  // Output: 2
    }
}
