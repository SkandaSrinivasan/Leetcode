import java.util.Arrays;

public class GreatestRight {
    public static int[] greatestRight(int[] arr) {
        int n = arr.length;
        if (n < 2) {
            arr[0] = -1;
            return arr;
        }
        int max = arr[n - 1];
        arr[n - 1] = -1;

        for (int i = n - 2; i >= 0; i--) {
            int current = arr[i];
            arr[i] = max;
            max = Math.max(max,current);
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] arr = new int[]{17,18,5,4,6,1};
        System.out.println(Arrays.toString(greatestRight(arr)));
    }
}
