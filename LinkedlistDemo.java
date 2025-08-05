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
            list.add(1);//add element
            list.add(2);
            list.addFirst(0);//add eleemnt to first 
            list.addLast(3);//add element to last
           /* System.out.println("get element at 3 :"+list.get(3));
            System.out.println("list elements :"+list);
            
            System.out.println("list elements :"+list);
            System.out.println("get element at 3 :"+list.get(3));*/
            System.out.println("list elements :"+list.removeFirst());//remove first element and return head ex:first element of list 
             System.out.println("list elements :"+list.get(2));//here we underatand that indexing of linked list start from 0(print element at last)
             System.out.println("list eleemnts :"+list);
             System.out.println("size of element :"+list.size());
            // for(int i=list.size()-1;i>0;i--){//reverse linkedlist
              //  System.out.println("reverse lis elemetn :"+list.get(i));
          //   }
             //Collections.reverse(list);//reverse list by using pre-defined method 
            System.out.println("Reversed list: " + list);
            //convert to array 
            //Object[] array = list.toArray();
            //System.out.println("Array: " + Arrays.toString(array));
            Object [] array=list.toArray();
            System.out.println("array of list is :"+ Arrays.toString(array));
            for(int j=0;j<array.length;j++){
                System.out.println("array elemetns are :"+array[j]);
            }







    }
}