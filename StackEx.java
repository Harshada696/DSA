import java.util.*;
class StackEx{
    public static void main(String args[]){
        Stack <Integer> stack =new Stack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        int poped=stack.pop();

        System.out.println("stack eleemnts :"+stack);
     
         System.out.println("Top: " + stack.peek()); // 30

        // Pop element
        int popped = stack.pop();
        System.out.println("Popped: " + popped); // 30

        // Check if stack is empty
        System.out.println("Is empty? " + stack.isEmpty()); // false

        // Size of stack
        System.out.println("Size: " + stack.size()); // 2
    }
}