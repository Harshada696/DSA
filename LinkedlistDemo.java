import java.util.*;
class LinkedListDemo{
    public static void main(String args[]){
        //LinkedList <Integer> list=new LinkedList <>();
        LinkedList<Integer> list = new LinkedList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        System.out.println(list.remove());//this will remove the head of the list :1
            System.out.println(list);
            list.addFirst(1);
            System.out.println("new list:"+list);

    }
}