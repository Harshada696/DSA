class LinearSearchwithReturn{
    public static int search(int arr[],int target){
        boolean flag=false;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==target){
                return i;
                

            }
        }
        return -1;

    }
public static void main(String[] args){
    int arr[]={1,2,3,4,5};
    int target=2;
    int result=search(arr,target);
    if(result!=-1){
        System.out.println("Element found at Index : "+result);
    }
    else{
        System.out.println("Element not found ");
    }


}
}