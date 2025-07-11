class Number_sum{
    public static void main(String []args){
        //reverse a number 
        int rev_a=123;
        int rev=0;
        while(rev_a !=0){
            int digit=rev_a%10;
            rev=rev*10+digit;
            rev_a/=10;

        }
        System.out.println("reverse of the number :"+ rev);
        //sum of digit 
        int a=123;
        int sum=0;
        while(a !=0){
            int digit=a%10;
            sum+=digit;
            a=a/10;
        }
        System.out.println("sum of the number :"+sum);
        
}}