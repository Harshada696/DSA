import java.util.Scanner;
public class Insertionsort{
    public static void Insert(int arr[]){ // insertion sort function
    for(int i=1;i<arr.length;i++){
        int key=arr[i];
        int j=i-1;
        while(j>=0 && arr[j]>key){
            arr[j+1]=arr[j];
            j--;
        }
           arr[j+1]=key;
        
    }
 }
    public static void print(int arr[]){ // print function to print array element
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }
        public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter size of Array : ");
        int size=sc.nextInt(); // user input size of array
        System.out.print("Enter element of array : ");
        int[] arr=new int[size];
        for(int i=0;i<arr.length;i++){ // user input array elements
            arr[i]=sc.nextInt();
        }
        Insert(arr);//call Insert sort function
        print(arr);

    }
}