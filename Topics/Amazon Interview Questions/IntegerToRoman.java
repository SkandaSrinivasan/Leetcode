public class IntegerToRoman {
    public String intToRoman(int num) {
        int[] values = { 1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1 };
        String[] symbols = { "M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV",
                "I" };
        StringBuilder solution = new StringBuilder();
        for(int i = 0; i < values.length; i++){
            while(num >= values[i]){
                num-=values[i];
                solution.append(symbols[i]);
            }
        }
        return solution.toString();
    }
    public static void main(String[] args){
        System.out.println(new IntegerToRoman().intToRoman(1994));
    }
}
