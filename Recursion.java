class Recursion {
    public static void printr(int num){
        if(num==5){
            return;
        }
        System.out.println(num);
        printr(num+1);
    }
    public static void sum_of_natural_no(int sum,int n,int i){
    
        if(i==n){
            sum+=i;
            System.out.println(sum);
            return ;

        }
        sum+=i;
        sum_of_natural_no(sum,n,i+1);

    }
    public static void main(String[] args){
        int num=1;
        int n=5;
        int i=1;
        int sum=0;
        
        sum_of_natural_no(sum,n,i+1);
    }
}