public class DecodeString {
    public String decodeString(String s) {
        int pointer = 0;
        StringBuilder sol = new StringBuilder();
        while(pointer < s.length()){
            Character curr = s.charAt(pointer);
            if(Character.isLetter(curr)){
                sol.append(curr);
                pointer++;
            }
            else{
                int times = 0;
                times = Character.getNumericValue(curr);
                pointer = pointer+2;
                StringBuilder repeatString = new StringBuilder();
                while(s.charAt(pointer) != ']'){
                    repeatString.append(s.charAt(pointer));
                    pointer++;
                }
                while(times != 0){
                    sol.append(repeatString);
                    times--;
                }
                pointer++;
            }
        }
        return sol.toString();
    }
    public static void main(String[] args){
    String input = "abc3[cd]xyz";
    String out = "abccdcdcdxyz";
    DecodeString o = new DecodeString();
    System.out.println(o.decodeString(input).equals(out));
    }
}
