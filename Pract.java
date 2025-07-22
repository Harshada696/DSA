class Pract{
    public static void main(String [] args){
       //GCD of 2 number 
       int num=12;
       int num2=24;
       int a=num;
       int b=num2;
       while(b !=0){
        int temp=b;
        b=a%b;
         a=temp;
       }
       System.out.println("GCD is :"+a);
       int lcm=(num *num2)/a;
       
       System.out.println("LCM of 2 number is :" + lcm);
    }
}