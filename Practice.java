class Practice{
    public static void prime(){
      int num=2;
      boolean check=false;
      if(num<=1){
        System.out.println("not prime ");
      }
      
        for(int i=2;i<=Math.sqrt(num);i++){
          if(num % i == 0){
            check=true;
            break;
          }

        }
        if(check){
          System.out.println("it is prime ");
        }
        else{
          System.out.println("it is not prime ");
        }
      
      

    }

    public static void practice(){
      prime();
      //sum of digit of given number 
      int a_n=345;
      System.out.println(a_n);
      //febonasis series
      int a=5;
      int first=0;
      int second=1;
      int third=first+second;
      
      for(int i=3;i<a;i++){
        first=second;
        second=third;
        System.out.println(third);
      } 





      //contribute your logical code 
      //reverse array elements;
      int arr[]={1,2,3,4,5};
      int init=0;
      int end=arr.length-1;
      System.out.println(arr.length);
      while(init<end){
        int temp=arr[init];
        arr[init]=arr[end];
        arr[end]=temp;
        init++;
        end--;
      }
      for(int i=0;i<arr.length;i++){
        System.out.println(arr[i]);
      }

      
    } 
    public static void printp(){
       int nu=5;
      for(int i=1;i<=nu;i++){
        for(int j=1;j<=i;j++){
          System.out.print("*");
        }
        for(int j=1;j<=2*(nu-i);j++){
          System.out.print(" ");
        }
        for(int j=1;j<=i;j++){
          System.out.print("*");
        }
        System.out.println();


      }
        for(int i=nu-1;i>=1;i--){
        for(int j=1;j<=i;j++){
          System.out.print("*");
        }
        for(int j=1;j<=2*(nu-i);j++){
          System.out.print(" ");
        }
        for(int j=1;j<=i;j++){
          System.out.print("*");
        }
        System.out.println();


      }

    }
    public static void main(String[] args){
        
      //factorial 
      int num=5;
      int fact=1;
      for(int i=1;i<=num;i++){
        fact=fact*i;
       }
      System.out.println(fact);

      //check whether given number is prime or not 
      int n=22;
      boolean check=true;
      if(n<=1){
        System.out.println("no is not prime ");
      }
      else{
        for(int i=2;i<=Math.sqrt(n);i++){
          if(n%i==0){
            check=false;
            
            
          }
          
        }
        if(check==false){
          System.out.println("number is not prime ");
        }
        else{
          System.out.println("number is prime ");
        }
      }
      //fibonacci series 
      int nf=10;
      int first=0;
      int second=1;
      System.out.println("fisrt number:"+first+"Second number :"+second);
      for(int i=3;i<=nf;i++){
        int third=first+second;
        System.out.println(third);
        first=second;
        second=third;


      }
      printp();
      harshu();
      }
      public static void harshu(){
        int n=5;
        for(int i=1;i<=n;i++){
          for(int j=1;j<=i;j++){
            System.out.print(i);
          }
          System.out.println();
        }


      }
      





}