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
        //search (bubble sort)
        for(int h=0;h<size-1;h++){
            for(int p=0;p<size-h-1;p++){
                if(arr[p]>arr[p+1]){
                    int temp=arr[p];
                    arr[p]=arr[p+1];
                    arr[p+1]=temp;
                }
            }

        }

        System.out.print(" sorted arry elelemt:");
          for(int i=0;i<size;i++){
          System.out.println(arr[i]);
            
        }
        //smallest element 
        System.out.println("smallest element of array :"+arr[0]);
        //Largest number of array;
        System.out.println("largest element of array :"+arr[size-1]);



    }
    public static void main(String args[]){
        sort_search();
        

        
    }
}