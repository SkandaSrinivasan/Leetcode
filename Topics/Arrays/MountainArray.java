import java.io.*;
public class MountainArray{
    public static boolean isMountain(int[] arr){
        int n = arr.length;
        int i = 0;
        if(n < 3 || arr[1] < arr[0]){
            return false;
        }
        while(i+1 < n && arr[i] < arr[i+1]){
                i+=1;
        }
        if(i == n-1 || i==0){
            return false;
        }
        while(i+1 < n && arr[i] > arr[i+1]){
                i+=1;
        }
        return i == n-1;
    }
    public static void main(String[] args){
        int test[] = new int[]{0,1,2,3,4,5,6,7,8,9};
        System.out.println(isMountain(test));
    }
}