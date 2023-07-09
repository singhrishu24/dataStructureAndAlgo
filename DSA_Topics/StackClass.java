import java.util.ArrayList;
import java.util.*;
import java.util.List;


public class StackClass{
    class Stack{
        ArrayList<Integer> list = new ArrayList<Integer>();
        public static boolean isEmpty(){
            return list.size()==0;
        
        }
        //Push
        public void push(data){
            list.add(data);
        }
        //Pop
        public int pop(data){
            if(isEmpty()){
                return -1;
            }
            int top = list.get(list.size()-1);
            list.remove(list.size()-1);
            return top;
        }
        //Peek
        public int peek(){
            if(isEmpty()){
                return-1;
            }
            return list.get(list.size()-1);
        }
    }
    
    
    /*static class Node{
        int data;
        Node next;
        public Node(int data){
            this.data = data;
            next = null;
        }
    }

    static class Stack{
        public static Node head;
        public static boolean isEmpty(){
            return head ==null;
        }
        
        public static void push(int data){
            Node newNode = new Node(data);
            if(isEmpty()){
                head = newNode;
                return;
            }
            newNode.next = head;
            head = newNode;
        }

        public static int pop(){
            if(isEmpty()){
                return -1;
            }
            int top = head.data;
            head = head.next;
            return top;
        }

        public static int peek(){
            if(isEmpty()){
                return -1;
            }
            return head.data;
        }
    
    }*/


    public static void main(String args[]){
        Stack stack = new Stack();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);

        while (!stack.isEmpty()){
            System.out.println(stack.peek());
            stack.pop();
        }
    }
}
