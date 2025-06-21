class LinearSearch{
    static void Search(int arr[],int target){
        boolean flag=false;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==target){
                System.out.println("Element found At Index : "+i);
                flag=true;
                break;

            }
        }
        if(flag==false){
            System.out.println("Target not Found ");
        }
    }
    public static void main (String[] args)
{
    int arr[]={1,2,3,4,5};
    int target=4;
    Search(arr,target);

}
}
