public class MaxConsecOnes2 {
    public static int findMaxOnes(int[] nums) {
        int zeroNums = 0;
        int right = 0;
        int left = 0;
        int seqLength = 0;
        while(right < nums.length){
            if(nums[right] == 0){
                zeroNums++;
            }

            while(zeroNums == 2){
                if(nums[left] == 0){
                    zeroNums--;
                }
                left++;
            }
            seqLength = Math.max(seqLength , right-left+1);
            right++;
        }
        return seqLength;
    }

    public static void main(String[] args) {
        int[] test = new int[] { 1, 1, 0, 1 };
        System.out.println(findMaxOnes(test));
    }
}
