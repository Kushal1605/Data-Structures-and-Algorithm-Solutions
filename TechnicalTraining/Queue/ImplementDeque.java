/*
 * https://www.codingninjas.com/codestudio/problems/deque_1170059?leftPanelTab=0
 */

 import java.util.* ;
 import java.io.*; 
 
 public class Deque 
 {
     // Initialize your data structure.
     int [] deque;
     int front, rear;
     public Deque(int n) 
     {
         // Write your code here.
         deque = new int [n];
         front = rear = -1;
     }
 
     // Pushes 'X' in the front of the deque. Returns true if it gets pushed into the deque, and false otherwise.
     public boolean pushFront(int x) 
     {
         // Write your code here
         if(isFull()) return false;
         if(rear == -1)
             rear = 0;
         if(front == -1) {
             front = 0;
             deque[front] = x;
         } else {
             front = (front - 1)% deque.length;
             if(front < 0)
                 front += deque.length;
             deque[front] = x;
         }
         return true;
     }
 
     // Pushes 'X' in the back of the deque. Returns true if it gets pushed into the deque, and false otherwise.
     public boolean pushRear(int x) 
     {
         // Write your code here.
         if(isFull()) return false;
         if(front == -1)
             front = 0;
         rear = (rear + 1)%deque.length;
         deque[rear] = x;
         return true;
     }
 
     // Pops an element from the front of the deque. Returns -1 if the deque is empty, otherwise returns the popped element.
     public int popFront() 
     {
         // Write your code here.
         if(isEmpty()) return -1;
         int val = deque[front];
         if(front == rear) {
             front = -1;
             rear = -1;
         } else
             front = (front + 1)%deque.length;
         return val;
     }
 
     // Pops an element from the back of the deque. Returns -1 if the deque is empty, otherwise returns the popped element.
     public int popRear() 
     {
         // Write your code here.
         if(isEmpty()) return -1;
         int val = deque[rear];
         if(front == rear) {
             front = -1;
             rear = -1;
         } else {
             rear = (rear - 1)%deque.length;
             if(rear < 0)
                 rear += deque.length;
         }
         return val;
     }
 
     // Returns the first element of the deque. If the deque is empty, it returns -1.
     public int getFront() 
     {
         // Write your code here.
         if(isEmpty()) return -1;
         return deque[front];
     }
 
     // Returns the last element of the deque. If the deque is empty, it returns -1.
     public int getRear() 
     {
         // Write your code here.
         if(isEmpty()) return -1;
         return deque[rear];
     }
 
     // Returns true if the deque is empty. Otherwise returns false.
     public boolean isEmpty() 
     {
         // Write your code here.
         if(front == -1 && rear == -1) return true;
         return false;
     }
 
     // Returns true if the deque is full. Otherwise returns false.
     public boolean isFull() 
     {
         // Write your code here
         if((rear + 1)%deque.length == front) return true;
         return false;
     }
 }
 