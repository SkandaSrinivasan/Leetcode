import java.util.Arrays;

public class MoveZeroesEnd {
    public static void moveZeroes(int[] nums) {
        int slow = 0;
        for (int fast = 0; fast < nums.length; fast++) {
            if (nums[fast] != 0) {
                swap(nums, fast, slow);
                slow++;
            }
        }
    }

    public static void swap(int[] nums, int a, int b) {
        int temp = 0;
        temp = nums[a];
        nums[a] = nums[b];
        nums[b] = temp;
    }

    public static void main(String[] args) {
        int[] nums = new int[] { 1, 2, 3, 0, 4 };
        moveZeroes(nums);
        System.out.println(Arrays.toString(nums));
    }
}
