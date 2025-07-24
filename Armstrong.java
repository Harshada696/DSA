class Armstrong {
    public static boolean isarmstrong(int num){
        int original=num;
        int result=0;
        int digits=String.valueOf(num).length();//convert number to strign tthen calculate the length of digit 
        while(num !=0){
            int digit=num%10;
            result+=Math.pow(digit,digits);
            num/=10;
        }
        return original==result;

    }
    public static void main(String [] args){
        int num=153;
        if(isarmstrong(num)){
            System.out.println("number is armstrong");
        }
        else{
            System.out.println("number is not armstrong ");
        }

    }
}