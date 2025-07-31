//stack and queue (revision)
import java.util.*;
class Colelction_Pract{
    public static void main(String [] args){
        Scanner  sc=new Scanner(System.in);
       /* Stack <Integer> stack=new Stack<>();
        System.out.println("enter lenght of stack elements :");
        int num=sc.nextInt();
        System.out.println("enter stack elements :");
        for(int i=1;i<=num;i++){
            int value=sc.nextInt();
            stack.push(value);
        }
        System.out.println("eleemts of stack:"+ stack);*/
        Queue <Integer> queue=new LinkedList<>();
        System.out.println("enter numner till yor queue goes :");
        int num=sc.nextInt();
        System.out.println("enter Queu leemtn:");
        for(int i=1;i<=num;i++){
            int val=sc.nextInt();
            queue.add(val);

        }
        System.out.println("your queue a=elemts :"+queue);
        
    }
}