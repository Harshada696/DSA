class Top_Ten_Basic{
    public static void fibonacci(){
        int n=5;
        int first=0;
        int second=1;
        System.out.print(first+"\t");
        System.out.print(second+"\t");
        for(int i=3;i<=n;i++){
            int third=first+second;
            System.out.print(third+"\t");
            first=second;
            second=third;
            }

    }
    public static void fact(){
        int num=5;
        int fact=1;
        for(int i=1;i<=num;i++){
            fact*=i;
        }
        System.out.println(fact);
    }
    public static void isprime(){
        int num=11;
        boolean isprime=true; // initially assume true 
        if(num<=1){
            isprime=false;
        }
        else{
            for(int i=2;i<=Math.sqrt(num);i++){
                if(num%i==0){
                    isprime=false;

                }
                
            }

        }
        if(isprime){
            System.out.println("Number is prime ");
        }
        else{
            System.out.println("Number is not prime ");
        }
    }
    public static void reverse(){//reverse String 
        String name="harshu";
        
        
        for(int i=name.length()-1;i>=0;i--){
            System.out.println(name.charAt(i));
        }
        
    }

    public static void sum(){
        int n=10;
        int sum=0;
        for(int i=0;i<=n;i++ ){
            sum+=n;

        }
        System.out.println("sum of natural numbers "+sum);
    }
    public static void swap(){
        int a=2;
        int b=4;
        a=a+b;
        b=a-b;
        a=a-b;
        System.out.println("a:"+a);
        System.out.println("b"+b);

    }
    public static void maxmin(){
        int arr[]={1,2,3,4,5};
        int max=arr[0];
        int min=arr[0];
        for(int i=0;i<arr.length;i++){
            if(max<arr[i]){
                max=arr[i];
            
                
                
            }
            else{
                 min=arr[i];
            }
           }
           System.out.println("max element is :"+max);
           System.out.println("min element is :"+min);
    }
    public static void linear(){
        int arr[]={1,2,3,4,5};
        int search=3;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==search){
                System.out.println("Element found at index:"+i);
                break;
            }
        }
    }
    public static void palindrone(){
        int num=121;
        int orignal=num;
        int reverse=0;
        while(num!=0){
            int digit=num%10;
            reverse=reverse*10+digit;
            num/=10;
            
        }
        if(reverse==orignal){
            System.out.println("number is palindrone");
        }
        else{
            System.out.println("number is not palindrone");
        }

    }

    public static void armstrong(){
        int num=153;
        int original=num;
        int result=0;
        int digits=String.valueOf(num).length();
        while(num!=0){
            int digit=num%10;
            result+=Math.pow(digit,digits);
            num/=10;
        }
        if(original==result){
            System.out.println("number is armstrong");
        }
        else{
            System.out.println("number is not armstrong");
        }

    }
    public static void sum_even(){
        int sum=0;
        int num=5;
        
          
            for(int i=1;i<=num;i++){
                  if(i%2==0){
                   sum+=i;
            }
        }
        System.out.println("sum of Even numbers:"+sum);

    }
    public static void main (String args[]){
        fibonacci();
        fact();
        isprime();
        reverse();
        sum();
        swap();
        maxmin();
        linear();
        palindrone();
        armstrong();
        double name=12.12;
        double size=String.valueOf(name).replace(".","").length();//calcuate length 
        System.out.println(size);
        sum_even();
        //rombus print 
        int nr=5;
        for(int i=1;i<nr;i++){
            for(int j=1;j<nr-i;j++){
                System.out.print(" ");
            }
            for(int j=1;j<nr;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        
        for(int i=nr;i>=1;i--){
            for(int j=1;j<nr-i;j++){
                System.out.print(" ");
            }
            for(int j=1;j<nr;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    
}