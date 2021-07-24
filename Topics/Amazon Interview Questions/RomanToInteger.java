import java.util.HashMap;
import java.util.Map;

public class RomanToInteger {
    public int romanToInt(String s){
        int[] values = { 1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1 };
        String[] symbols = { "M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV",
                "I" };
        Map<String,Integer> m = new HashMap<>();
        for(int i = 0;i < values.length;i++){
            m.put(symbols[i], values[i]);
        }
        int i = 0;
        int sum = 0;
        while ( i < s.length()){
            if(i + 1 < s.length()){
                String doubleSymbol = s.substring(i, i+2);
                if(m.containsKey(doubleSymbol)){
                    sum+=m.get(doubleSymbol);
                    i+=2;
                    continue;
                }
            }
            String singleSymbol = s.substring(i,i+1);
            System.out.println("Single symbol: "+singleSymbol);
            sum+=m.get(singleSymbol);
            i++;
        }
        return sum;
    }
    public static void main(String[] args){
        System.out.println(new RomanToInteger().romanToInt("MCMXCIV"));
    }
}
