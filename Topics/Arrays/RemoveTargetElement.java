import java.util.Arrays;

public class RemoveTargetElement {
    public static int removeElement(int[] nums, int val) {
        int lastIndex = 0;
        for (int pointer = 0; pointer < nums.length; pointer++) {
            if (nums[pointer] != val) {
                nums[lastIndex] = nums[pointer];
                lastIndex++;
            }
        }
        return lastIndex;
    }

    public static void swap(int[] nums, int a, int b) {
        int temp = 0;
        temp = nums[a];
        nums[a] = nums[b];
        nums[b] = temp;
    }

    public static void main(String[] args) {
        int test[] = new int[]{1,2,2,2,3};
        System.out.println(removeElement(test, 2));
        System.out.println(Arrays.toString(test));
    }
}