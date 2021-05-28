public class ContainerWithMostWater {
    public int maxArea(int[] height) {
        int maxSize = 0;
        int left = 0;
        int right = height.length - 1;
    while(left < right){
        maxSize = Math.max(maxSize, Math.min(height[left], height[right]) * (right - 1) );
        if(height[left] < height[right]) left++;
        else right--;
    }
    return maxSize;
}

    public static void main(String[] args) {
        int[] test = new int[] {1,8,6,2,5,4,8,3,7};
        System.out.println(new ContainerWithMostWater().maxArea(test));
    }
}
