import java.util.*;
class LinkedListDemo{
    public static void main(String args[]){
       /* //LinkedList <Integer> list=new LinkedList <>();
        LinkedList<Integer> list = new LinkedList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        System.out.println(list.remove());//this will remove the head of the list :1
            System.out.println(list);
            list.addFirst(1);
            System.out.println("new list:"+list);
            list.addFirst(0);
            System.out.println("add to first:"+list);*/
            LinkedList <Integer> list=new LinkedList<>();
            list.add(1);
            list.add(2);
            list.addFirst(0);
            list.addLast(3);
           /* System.out.println("get element at 3 :"+list.get(3));
            System.out.println("list elements :"+list);
            
            System.out.println("list elements :"+list);
            System.out.println("get element at 3 :"+list.get(3));*/
            System.out.println("list elements :"+list.removeFirst());
             System.out.println("list elements :"+list.get(2));//here we underatand that indexing of linked list start from 0
             System.out.println("list eleemnts :"+list);




    }
}