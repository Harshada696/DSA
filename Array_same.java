class Array_same{
    public static boolean check(){
        int arr[]={1,2,3,4,6};
        int arr1[]={1,2,3,4,5};
        if(arr.length!=arr1.length){
            return false;

        }
        else{
        for(int i=0;i<arr.length;i++){
            
                if(arr[i]!=arr1[i]){
                    return false;
                }
               
            
        }
        return true;

    }
    }
    public static void main(String [] args){
        if(check()){
            System.out.println("array contails same elements");
        }
        else{
            System.out.println("array elements are not same");
        }
    }
}