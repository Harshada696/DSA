class SimpleSort {
    public static void main (String[] args ){
        int arr[]={6,5,4,3,7,1,2};
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]>arr[j]){
                    int temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;

                }
            }
        }
        for (int k=0;k<arr.length;k++){
            System.out.println(arr[k]);
        }
    }
}