public class ImplementstrStr {
    public int strStr(String haystack, String needle) {
        for(int i = 0 ; i <= (haystack.length() - needle.length());i++){
            if(haystack.charAt(i) == needle.charAt(0)){
                int j = 0;
                for(;j < needle.length();j++){
                    if(haystack.charAt(i+j) != needle.charAt(j)){
                        break;
                    }
                }
                    if(j == needle.length()) return i; 
                }
            }
            return -1;
        }
        
    public static void main(String[] args){
        String hayString = "a";
        String needleString = "a";
        ImplementstrStr o = new ImplementstrStr();
        System.out.println(o.strStr(hayString, needleString));
    }
}