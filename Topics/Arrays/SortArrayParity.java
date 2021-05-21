import java.util.Arrays;


public class SortArrayParity {
    public static int[] sortByParity(int[] A){
        int slow = 0;
        for(int fast = 0;fast<A.length;fast++){
            if(A[fast] % 2 == 0){
                swap(A, slow, fast);
                slow++;
            }
        }
        return A;
    }
    public static void swap(int[] nums, int a, int b) {
        int temp = 0;
        temp = nums[a];
        nums[a] = nums[b];
        nums[b] = temp;
    }
    public static void main(String[] args){
        int[] test = new int[]{3,7,2,4};
        System.out.println(Arrays.toString(sortByParity(test)));
    }
}
