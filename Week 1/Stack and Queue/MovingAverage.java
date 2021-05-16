import java.util.ArrayDeque;
import java.util.Deque;
//Trying the circular queue method. The standard queue method is easier to implement.
public class MovingAverage{
    int queue[],head = 0,tail = 0,size,count=0;
    int sum = 0;
    public MovingAverage(int size) {
        this.size = size;
        queue = new int[size];
    }
    
    public double next(int val) {
        count++;
        int tail = (head +1) % size;
        sum = sum - tail + val;
        return sum * 1.0 / Math.min(size,count);
    }
}