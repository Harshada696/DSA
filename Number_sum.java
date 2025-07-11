class Number_sum{
    public static void main(String []args){
        int a=123;
        int sum=0;
        while(a !=0){
            int digit=a%10;
            sum+=digit;
            a=a/10;
        }
        System.out.println("sum of the number :"+sum);
        
}}