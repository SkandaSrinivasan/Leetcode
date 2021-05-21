import java.util.Arrays;
import java.util.Stack;
//Instead of storing both values and indices, just store index and compare each turn
public class DailyTemperatures{
    public int[] dailyTemperatures(int[] temperatures) {
        int[] solution = new int[temperatures.length];
        Stack<Integer> stack = new Stack<>(); //Deque<Integer> is slightly faster here
        for(int i = 0 ; i < temperatures.length; i++){
            while(!stack.isEmpty() && temperatures[stack.peek()] < temperatures[i]){
                int index = stack.pop();
                solution[index] = i - index;
            }
            stack.push(i);
        }
        return solution;
    }
    public static void main(String[] args){
        int[] test = new int[]{73, 74, 75, 71, 69, 72, 76, 73};
        DailyTemperatures obj = new DailyTemperatures();
        System.out.println(Arrays.toString(obj.dailyTemperatures(test)));
    }
}