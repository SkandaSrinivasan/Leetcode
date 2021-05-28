import java.util.HashMap;
import java.util.Map;

public class LongestSubStringWithoutRepeating{
    public int lengthOfLongestSubstring(String s) {
        int solution = 0;
        Map<Character,Integer> m = new HashMap<>();
        for(int j =0 , i = 0 ; j < s.length(); j++){
            if(m.containsKey(s.charAt(j))){
                i = Math.max(m.get(s.charAt(j)),i);
            }
            solution = Math.max(solution, j - i + 1);
            m.put(s.charAt(j), j + 1);
        }
        return solution;
    }
}