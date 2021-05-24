public class LargestNumberAtleastTwice {
    public int dominantIndex(int[] nums) {
        if(nums.length == 1) return 0;
        int maxIndex = 0;
        for(int i = 1 ; i  < nums.length; i++){
            if(nums[i] >= nums[maxIndex]){
                maxIndex = i;
            }
        }
        for(int i = 0 ; i < nums.length; i++){
            if(2*nums[i] > nums[maxIndex] && i != maxIndex)
                return -1;
        }
        return maxIndex;
    }
    public static void main(String[] args){
        int[] test = new int[] {3,6,1,0};
        LargestNumberAtleastTwice o = new LargestNumberAtleastTwice();
        System.out.println(o.dominantIndex(test));
    }
} 
