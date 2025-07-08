class Max{
    public static void main(String[]args ){
    int arr[]={1,2,2,3,2};
    for(int i=0;i<arr.length;i++){
        for(int j=0;j<arr.length;j++){
            int count=0;
            if(arr[i]==arr[j]){
                count++
                System.out.print("duplicates are :"+arr[i]);
            }
        }

  }
    
}
}