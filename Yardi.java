class Yardi{


public static void sum_witthout_arg(){
    int arr[]={1,2,3,4,5};
    int sum=0;
    for(int i=0;i<arr.length;i++){
        sum+=arr[i];

    }
    System.out.println("Sum of element of array :"+ sum);
}
public static int  sum(int arr[]){
    int sum=0;
    for(int i=0;i<arr.length;i++){
        sum+=arr[i];

    }
    return sum;

}
public static int larg(int arr[]){
   int max=arr[0];
   for(int i=0;i<arr.length;i++){
    if(arr[i]>max){
        max=arr[i];
    }
   }
   return max;


}
public static void n_pal(){
    int num=2222;
    int reverse=0;
    while(num>0){
        num
    }

}

    public static void main(String [] args){
        /*String name="madam";
        String reverse="";
        for(int i=name.length()-1;i>=0;i--){
            reverse+=name.charAt(i);
        }
        if(name.equals(reverse)){
            System.out.println("string is palinrome");
        }
        else{
            System.out.println("string is no palindrome");
        } */
      /* String name="harshu"; //using string builder 
       StringBuilder reverse=new StringBuilder();
       for(int i=name.length()-1;i>=0;i--){
            reverse.append(name.charAt(i));
        }
             if(name.equals(reverse.toString())){
            System.out.println("string is palinrome");
        }
        else{
            System.out.println("string is no palindrome");
        } */
       //using strign builder function
      /* String name="madam";
       String reverse=new StringBuilder(name).reverse().toString();
       if(name.equals(reverse)){
        System.out.println("String is Palindrome");

       }
       else{
        System.out.println("string is not palindrome");
       } */
   
      int arr[]={1,2,3,4,5};
      int larg_el=larg(arr);
      System.out.println("largest lement:"+larg_el);


    }
}