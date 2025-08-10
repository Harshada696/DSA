import java.util.*;
class PracticeY{
    public static void main(String [] args){
        Scanner sc=new Scanner (System.in);
        System.out.print("enter array length");
        int n=sc.nextInt();
        System.out.print("enter eleemnt of an array:");
        
        int[] arr=new int[n];
           for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }

        for(int i=n-1;i>=0;i--){
            System.out.print(arr[i]);
        }

    }
}
