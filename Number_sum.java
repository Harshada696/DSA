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

        // check if a number is palindrome
        int rev_number=111;
        int rev1=0;
        int original=rev_number;
        while(rev_number !=0){
            int digit=rev_number%10;
            rev1=rev1*10+digit;
            rev_number/=10;
        }
        if(rev1 == original){
            System.out.println("number is palindrome");
        }
        else{
            System.out.println("number is not palindrome");
        }
       //calcualte lenth of arr 
       int arr[]={1,2,3,4,5};
       int count=0;
       int len=arr.length;
       System.out.println("length of array using fun "+ len);
       for(int i=0;i<arr.length;i++){
       // count++;

       }  
       System.out.println("count is :"+ count);      
}}
