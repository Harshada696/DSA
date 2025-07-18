import java.util.Scanner;
class Practice_2{

    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        int input;
        
        int pass=1234;
       do{
            System.out.println("Enter password:");
             input=sc.nextInt();

            System.out.println("Try Again");

        }while(pass !=input);

    

    }
}