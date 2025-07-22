class Pract{
    public static void main(String [] args){
        //palindrome number 
        int num=111;
        int original=num;
        int reverse=0;
        while(num !=0){
            int digit=num%10;
            reverse=reverse*10+digit;
            num/=10;
        }
        if(original==reverse){
            System.out.println("number is palindrome");
        }
        else{
            System.out.println("not palindrome");
        }
    }
}