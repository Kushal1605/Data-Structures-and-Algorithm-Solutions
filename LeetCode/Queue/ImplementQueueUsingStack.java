/*
 * https://leetcode.com/problems/implement-queue-using-stacks/
 */

class MyQueue {
    int [] stack;
    int front;
    int rear;
    int size = 1000;
    public MyQueue() {
        this.stack =  new int[size];
        this.front = 0;
        this.rear = 0;
    }
    
    public void push(int x) {
        if(front == size)
            return;
        stack[front] = x;
        front += 1;
    }
    
    public int pop() {
        int temp = 0;
        if(!empty()) {
            temp = stack[rear];
            rear += 1;
        }
        return temp;
    }
    
    public int peek() {
        if(!empty())
            return stack[rear];
        return 0;        
    }
    
    public boolean empty() {
        if(front == rear) return true;
        return false;
    }
}
