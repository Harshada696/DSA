clas LCM{
    public static void lcm(){
        //for finding lcm we need to find gcd 
        //lcm formula :- (num1*num2)/gcd
        int num1=12;
        int num2=24;
        int a=num1;
        int b=num2;
        while(b !=0){
            int temp=b;
            b=a%b;
            a=temp;

        }
        int gcd=a;
        System.out.println("gcd is :"+gcd);
        //finding lcm
        int lcm=(num1+num2)/gcd;
        System.out.println("lcm of 2 number :"+lcm);
    }
    public static void main(String [] args){
        lcm();
    }
}