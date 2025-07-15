import java.util.Scanner;
class Sort_search{
    public static void sort_search(){
        
        Scanner sc=new Scanner(System.in);
        System.out.println("enetr size of array :");
        int size=sc.nextInt();
        int [] arr=new int[size];
        System.out.println("element arry element :");
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
            
        }
        System.out.println("arry elelemt:");
          for(int i=0;i<size;i++){
          System.out.print(arr[i]);
            
        }


    }
    public static void main(String args[]){
        sort_search();
        

        
    }
}