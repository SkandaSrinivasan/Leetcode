import java.util.ArrayDeque;
import java.util.Deque;

public class MovingAverage{
    int size, sum = 0 , count = 0;
    Deque q = new ArrayDeque<Integer>();
    public MovingAverage(int size) {
        this.size = size;
    }
    
    public double next(int val) {
        count++;
        q.add(val);
        int head = 0;
        if(count > size){
            head = q.poll();
        }
        sum = sum - head + val;
        return sum * 1.0 / Math.min(size, count);
    }
}