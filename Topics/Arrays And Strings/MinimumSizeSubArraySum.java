public class MinimumSizeSubArraySum {
    public int minSubArrayLen(int target, int[] nums) {
        //Contract window to the smallest size possible while still meeting condition
        int sol = Integer.MAX_VALUE;
        int left = 0 ;
        int sum = 0;
        for(int i = 0;i < nums.length;i++){
            sum +=nums[i];
            while(sum >= target){
                sol = Math.min(sol,i+1-left);
                sum -= nums[left];
                left++;
            }
        }
        return sol != Integer.MAX_VALUE?sol: 0;
    }
    public static void main(String[] args){
    int test[] = new int[]{2,3,1,2,4,3};
    System.out.println(new MinimumSizeSubArraySum().minSubArrayLen(7, test));
    }
}
