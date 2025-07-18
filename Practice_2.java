import java.util.Scanner;
class Practice_2{

    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        int input;
        int count=0;
        
        int pass=1234;
       do{
            System.out.println("Enter password:");
             input=sc.nextInt();
             count++;
              if(count==3){
                System.out.println("no more chances remain");
              }
              else{
                System.out.println("Try Again");
              }
            

        }while(count !=3);

    

    }
}