import java.util.*;
class Check_prime{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter number to check :");

        int num=sc.nextInt();
        boolean check=true;
        if(num<1){
            check=false;
        }
        else{
        for(int i=2;i<=Math.sqrt(num);i++){
            if(num%i==0){
                check=false;
                break;
            }
        }
        if(check){
            System.out.println("prime number ");
        }
        else{
            System.out.println("not prime");
        }
        }
    }
}