import java.util.Stack;
//Basic stack implementation. No Tricky conditions
public class ValidParantheses {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        if (s.length() < 2)
            return false;
        for (int i = 0; i < s.length(); i++) {
            char curr = s.charAt(i);
            if (curr == '{' || curr == '(' || curr == '[') {
                stack.push(curr);
            } else {
                switch (curr) {
                case '}':
                    if (stack.peek() == '{')
                        stack.pop();
                    else
                        return false;
                    break;
                case ')':
                    if (stack.peek() == '(')
                        stack.pop();
                    else
                        return false;
                    break;
                case ']':
                    if (stack.peek() == '[')
                        stack.pop();
                    else
                        return false;
                    break;
                default:
                    return false;

                }
            }
        }
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        ValidParantheses obj = new ValidParantheses();
        String test = "()[]{}";
        System.out.println(obj.isValid(test));

    }
}
