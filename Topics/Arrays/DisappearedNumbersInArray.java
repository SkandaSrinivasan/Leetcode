import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class DisappearedNumbersInArray {
    public static List<Integer> findNos(int[] nums){
        for(int i = 0;i < nums.length; i++){
            int idx = Math.abs(nums[i]) - 1;
            if(nums[idx] > 0)
                nums[idx]*=-1;
        }
        System.out.println(Arrays.toString(nums));
        List<Integer> ans = new ArrayList<>();
        for(int i = 0;i < nums.length; i++){
            if(nums[i] > 0){
                ans.add(i+1);
            }
        }
        return ans;
    }
    public static void main(String[] args){
        int[] test = new int[]{1,2,2,4};
        System.out.println(findNos(test));
    }
}
