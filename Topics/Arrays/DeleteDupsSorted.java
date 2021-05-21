import java.util.Arrays;

public class DeleteDupsSorted {
    public static int removeDups(int[] nums) {
        int i = 0;
        for(int j=1;j<nums.length;j++){
            if(nums[j] != nums[i]){
                i++;
                nums[i] = nums[j];
            }
        }
    return i+1;
    }

    public static void main(String[] args) {
        int[] test = new int[] { 1, 2, 3 };
        System.out.println(removeDups(test));
    }
}
