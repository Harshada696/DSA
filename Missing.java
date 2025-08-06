class Minssing{
public static void main(String args[]){
    int arr[]={1,2,3,5,6};
    int n=arr.length+1;
    int ex_sum=(n*(n+1)/2);
    int sum=0;
    for(int i=0;i<arr.length;i++){
        sum+=arr[i];

    }
    int missing =ex_sum-sum;
    System.out.println("missing number :"+ missing);//printing missing values 

}
}