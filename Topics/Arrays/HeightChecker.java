import java.util.Arrays;

public class HeightChecker {
    public static int heightChecker(int[] heights) {
        int[] expected = heights.clone();
        Arrays.sort(expected);
        int ans = 0;
        for (int i = 0; i < heights.length; i++) {
            if (heights[i] != expected[i])
                ans++;
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] test = new int[] { 1, 1, 4, 2, 1, 3 };
        System.out.println(heightChecker(test));
    }
}
