class TOP_10_BY_COMPANY{
       public static void reverse(String str){
        String reverse="";
                  for(int i=str.length()-1;i>=0;i--){
                    reverse+=str.charAt(i);

                  }
                  System.out.println("Reverse strign is :"+ reverse);

       }
       
       public static boolean isPrime(int  prime){
        if(prime<=1){
            return false;
}   else{    for(int i=2;i<=Math.sqrt(prime);i++){
    if(prime%i==0){
        return false;
       
    }
  
}
return true;
       }}
     public static void fact_fun(int fact){
        int total=1;
        for(int i=1;i<=fact;i++){
            total*=i;
        }
        System.out.println("factorial of :"+ fact +"is"+total);

     }
     //fibo series;
     public static void fibo(){
        int input=7;
        int first_num=0;
        int sec_num=1;
        System.out.print(first_num);
        System.out.println(sec_num);
        for(int i=2;i<input;i++){
            int third=first_num+sec_num;
            System.out.print(third);
             first_num=sec_num;
            sec_num=third;
        }


     }
     //palindrome String 
     public static void pal(){
        String str="harshu";
        String original=str;

        String reverse="";
                  for(int i=str.length()-1;i>=0;i--){
                    reverse+=str.charAt(i);

                  }
                  System.out.println("Reverse strign is :"+ reverse);
                  if(original.equals(reverse)){
                    System.out.println("string is palindrome");
                  }
                  else{
                    System.out.println("string is not palindrome");
                  }

     }
     //palindrome number 
     public static void pal_num(){
      int num=111;
      int original=num;
      int reverse=0;
      while(num !=0){
        int digit=num%10;
        reverse=reverse*10+digit;
        num=num/10;
      }
      if(original==reverse){
        System.out.println("number is palindrome");

      }
      else{
        System.out.println("number is not palindrome");
      }
      
     }
     //largest number of array
     public static void max(){
        int arr[]={1,2,3,4,5};
        int max=arr[0];
        
        
        for(int i=0;i<arr.length;i++){
            if(arr[0]<arr[i]){
                max=arr[i];
            }
        }
        System.out.println("max is :"+max);

     }
     //count the frequency;
     public static void fre(){
        int arr[]={1,2,2,4,4,3};
        int count=0;
        for(int i=0;i<arr.length-1;i++){
            if(arr[i]==arr[i+1]){
                count++;
                System.out.print("count :"+ arr[i] + count );

            }
        }
     }
     //armstrong;
     
     //sort arry;
     public static void sort(){
      int arr[]={3,4,5,2,1,1};
      for(int i=0;i<arr.length-1;i++){
        for(int j=0;j<arr.length-1-i;j++){
          if(arr[j]>arr[j+1]){
            int temp=arr[j];
            arr[j]=arr[j+1];
            arr[j+1]=temp;

          }
        }
      }
      System.out.print("sorted arry");
      for(int i=0;i<arr.length;i++){
      System.out.print(arr[i]);
      }
     }
     //find second largest;

        public static void main(String []args){
            pal_num();
            int fact=5;
            int prime=31;
            String str="harshu";
            reverse(str);
           
           if(isPrime(prime)){
            System.out.println("its prime ");
           }
           else{
            System.out.println("not primr");
           }

           fact_fun(fact);
           fibo();
           pal();
           max();
           fre();
           sort();
           


        }
}