/*
 * https://leetcode.com/problems/design-circular-queue/
 */

 class MyCircularQueue {
    int [] queue;
    int front;
    int rear;
    int size;
    public MyCircularQueue(int k) {
        this.size = k;
        this.queue = new int [size];
        this.front = -1;
        this.rear = -1;
    }
    
    public boolean enQueue(int value) {
        if(isFull())
            return false;
        rear = (rear + 1)%size;
        queue[rear] = value;
        if(front == -1) front = 0;
        return true;
    }
    
    public boolean deQueue() {
        if(isEmpty())
            return false;
            if(front == rear) {
                front = -1;
                rear = -1;
                return true;
            }
        front = (front + 1)%size;
        return true;
    }
    
    public int Front() {
        if(isEmpty())
            return -1;
        return queue[front];
    }
    
    public int Rear() {
        if(isEmpty())
            return -1;
        return queue[rear];
    }
    
    public boolean isEmpty() {
        if(rear == -1 && front == -1) return true;
        return false;
    }
    
    public boolean isFull() {
        if((rear + 1)%size == front) return true;
        return false;
    }
}
