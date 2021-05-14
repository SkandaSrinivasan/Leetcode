/*
Two Important formulae here:
Enqueue index caclulation: insert it at this index (front+size) % capacity
Dequeue index calculation : new front location = (front+1) % capacity , then decrease the size
Tail index caclulation : tail = (front+size - 1) % capacity
*/
public class MyCircularQueueArray{
        int front;
        int rear;
        int size;
        int capacity;
        int[] queue;
        public MyCircularQueueArray(int k) {
            front = rear = 0;
            queue = new int[k];
            this.capacity = k;
            size = 0;
        }
        
        public boolean enQueue(int value) {
            if(isFull()) return false;
            queue[(this.front + size) % capacity] = value;
            size++;
            return true;

        }
        
        public boolean deQueue() {
            if(isEmpty()) return false;
            front = (front+1) % capacity;
            size--;
            return true;            
        }
        
        public int Front() {
            if(isEmpty()) return -1;
            return queue[front];
        }
        
        public int Rear() {
            if(this.isEmpty()) return -1;
            return queue[head+size-1] % capacity;
        }
        
        public boolean isEmpty() {
            return (size == 0);                        
        }
        
        public boolean isFull() {
            return (size == capacity);            
        }
    
    /**
     * Your MyCircularQueue object will be instantiated and called as such:
     * MyCircularQueue obj = new MyCircularQueue(k);
     * boolean param_1 = obj.enQueue(value);
     * boolean param_2 = obj.deQueue();
     * int param_3 = obj.Front();
     * int param_4 = obj.Rear();
     * boolean param_5 = obj.isEmpty();
     * boolean param_6 = obj.isFull();
     */
    public static void main(String[] args){

    }
}