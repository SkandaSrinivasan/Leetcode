import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class NandDouble {
    public static boolean checkIfExist(int[] arr) {
        HashSet<Integer> set = new HashSet<>();
        for (int i : arr) {
            if (set.contains(i * 2) || (i % 2 == 0 && set.contains(i / 2))) {
                return true;
            }
            set.add(i);
        }
        return false;
    }

    public static void main(String[] args) {
        int a[] = { 1, 2, 4 };
        int b[] = { 1, 1, 1, 1 };
        System.out.println(checkIfExist(a));
        System.out.println(checkIfExist(b));
    }
}