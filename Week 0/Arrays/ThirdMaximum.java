import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Set;
import java.util.ArrayList;
public class ThirdMaximum {
    public static int thirdMax(int[] nums){
        Set<Integer> maximums = new HashSet<>();
        for(int num:nums){
            maximums.add(num);
            if(maximums.size() > 3){
                maximums.remove(Collections.min(maximums));
            }
        }
        if(maximums.size() == 3){
            return Collections.min(maximums);
        }
        else
            return Collections.max(maximums);
    }
    public static void main(String[] args){
        int[] test = new int[]{1,2};
        System.out.println(thirdMax(test));
    }
}
