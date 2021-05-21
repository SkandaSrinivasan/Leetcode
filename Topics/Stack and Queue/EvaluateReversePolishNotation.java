import java.util.Deque;
import java.util.Stack;
import java.util.ArrayDeque;
public class EvaluateReversePolishNotation {
    public int evalRPN(String[] tokens) {
        Deque<Integer> stack = new ArrayDeque<>();
        for(int i = 0;i < tokens.length; i++){
            String tok = tokens[i];
            if(tok.equals("+") || tok.equals("-") || tok.equals("*") || tok.equals("/")){
                int a = stack.pop();
                int b = stack.pop();
                switch(tok){
                    case "+":stack.push(a+b);
                        break;
                    case "-":stack.push(b-a);
                        break;
                    case "*":stack.push(a*b);
                        break;
                    case "/":stack.push(b/a);
                        break;
                }
            }
            else{
                stack.push(Integer.parseInt(tok));
            }
        }
        return stack.pop();
    }

    public static void main(String[] args) {
        String[] test = new String[] { "10", "6", "9", "3", "+", "-11", "*", "/", "*", "17", "+", "5", "+" };
        EvaluateReversePolishNotation obj = new EvaluateReversePolishNotation();
        System.out.println( obj.evalRPN(test));
    }
}
