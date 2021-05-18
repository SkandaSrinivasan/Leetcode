import java.util.Stack;

public class ValidParantheses {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        if (s.length() < 2)
            return false;
        return true;
    }

    public static void main(String[] args) {
        ValidParantheses obj = new ValidParantheses();
        obj.isValid("(");
        System.out.println(obj.isValid(")"));
        
    }
}
