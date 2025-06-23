import java.util.Scanner;
class Whileloop{
    public static void whilep(){//simple program to print 1 to 10 
        int i=1;
        while(i<=10){
            System.out.println("i  = "+i);
            i++;
        }
    }
    public static void reverse(){
        int i=10;// print in reverse (10 to 1) 
        while(i>=1){
            System.out.println(i);
            i--;
        }
        
    }
    public static void sum(){ //sum of array elements 
        int i=0;
        int sum=0;
        int arr[]={1,2,3,4,5};

        while(i<=arr.length){
            sum+=i;
            i++;


        }
        System.out.println("sum of array elements:"+sum);
    }
    public static void even(){// even number from 1 to 10 
    int i=1;
    while(i<=10){
        if(i%2==0){
            System.out.println("even number: "+i);
        }
        i++;
    }

    }
    public static void sumofN(){//sum of natural numbers 
    int i=1;
    int sum=0;
    while(i<=10){
        sum+=i;
        i++;

    }
    System.out.println(sum);

    }
    public static void sumofNF(){//sum of natural numbers by using formula  
    int i=1;
    int sum=0;
    while(i<=10){
        sum=10*(10+1)/2;//formula N*(N+1)/2, here N is 10 
        i++;

    }
    System.out.println(sum);

    }
    public static void tablem(){//multiplication table of 2 
        int i=1;
        int n=3;//take any number to print table 
        while(i<=10){
            int table=n*i;
            System.out.println( table);
            i++;
        }
    }
    public static void odd(){//print odd numbers 
       int i=1;
       while(i<=10){
        if(i%2!=0){
            System.out.println(i);

        }
        i++;
       }
    }
    public static void sumofeven(){//sum of even numbers from 1 to N
        int i=0;// could start from i=1 b'caus 0+N=0
        int sum=0;
        while(i<=10){
            if(i%2==0){
                sum+=i;

            }
            i++;

        }
        System.out.println("sum of even numbers from (1 to 10) "+sum);

    }
    public static void Check(){//Print Numbers Until Zero
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number: ");
        int input=sc.nextInt();
        while(input!=0){
            System.out.println("your number:"+ input);
            input=sc.nextInt();

        }


    }


    public static void main(String[] args){
        whilep();
        reverse();
        sum();
        even();
        tablem();
        sumofN();
        sumofNF();
        odd();
        sumofeven();
        Check();

    }
}