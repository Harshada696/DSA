import java.util.*;
class Sort{
    public static void sort(int size,int arr[]){//efficinet sort (bubble sort)
        int swap=0;
        for(int i=0;i<size-1;i++){
            for(int j=0;j<size-1-i;j++){
                    if(arr[j]>arr[j+1]){
                        int temp=arr[i];
                        arr[i]=arr[j];
                        arr[j]=temp;
                        swap++;
                    }
            }
        }
        System.out.println("swaps"+ swap);
        print_arr(size,arr);

   
    }
        public static void sort1(int size,int arr[]){
        int swap=0;
        for(int i=0;i<size;i++){
            for(int j=i;j<size;j++){
                    if(arr[i]>arr[j]){
                        int temp=arr[i];
                        arr[i]=arr[j];
                        arr[j]=temp;
                        swap++;
                    }
            }
        }
        System.out.println("swaps"+ swap);
        print_arr(size,arr);

   
    }
    public static void print_arr(int size,int arr[]){
          
        for(int i=0;i<size;i++){
            System.out.println(arr[i]);
        }

    }
    public static void main(String args[]){
      
        Scanner sc=new Scanner(System.in);
        int size;
        do{
            System.out.println("enter size of array :");
             size=sc.nextInt();
            if(size == 0){
                System.out.println("Exiting program..");
                break;
            }
        
        
        int arr[]=new int[size];
        System.out.println("enter arry element:");
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
               
        }
          sort(size,arr);

        }while(size !=0);

    }
}