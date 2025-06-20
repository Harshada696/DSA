class Bubble{
    public static void main(String[] args ){
        int arr[]={3,2,5,4,1};
        for(int i=0;i<arr.length-1;i++){
            int flag=0;
            for(int j=0;j<arr.length-1-i;j++){
                if(arr[j]>arr[j+1]){
                    int temp;
                    temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                    flag=1;
                   
                }
            }
            if(flag==0){
                break;
            }
        }
        for(int k=0;k<arr.length;k++){
            System.out.println(arr[k]);
        }
    }
} 