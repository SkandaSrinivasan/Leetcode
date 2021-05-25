import java.util.Arrays;

public class ArrayPartitionI {
    //Trick is to add up every other element after sorting the array
    public int arrayPairSum(int[] nums) {
        Arrays.sort(nums);
        int result = 0;
        for(int i = 0 ; i < nums.length;i+=2){
            result+=nums[i];
        }
        return result;
    }
    public static void main(String[] args){
        ArrayPartitionI o = new ArrayPartitionI();
        int[] test = new int[]{1,2,3,4};
        System.out.println(o.arrayPairSum(test));
    }
}
