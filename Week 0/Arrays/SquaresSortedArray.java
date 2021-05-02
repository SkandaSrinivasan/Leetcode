import java.util.Arrays;

public class SquaresSortedArray {
    public static int[] sortedSquares(int[] nums) {
        int left = 0;
        int right = nums.length - 1;
        int res[] = new int[nums.length];
        int square = 0;
        for (int i = nums.length - 1; i >= 0; i--) {
            if(Math.abs(nums[right]) > Math.abs(nums[left])){
                square = nums[right] * nums[right];
                right--;
            }
            else{
                square = nums[left] * nums[left];
                left++;
            }
            res[i] = square;
        }
        return res;
    }
    public static void main(String[] args){
        int test[] = new int[]{-4,-1,0,3,10};
        System.out.println(Arrays.toString(sortedSquares(test)));
    }
}
