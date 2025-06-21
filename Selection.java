class Selection{
    static void sort(int arr[]){//I have named the function sort however, you may name it SelectionSort for better clarity.
        for(int i=0;i<arr.length;i++){
            int min=i;
            for(int j=i+1;j<arr.length;j++){
                if(arr[j]<arr[min]){
                    min=j;
                }
            }
            int temp=arr[i];
            arr[i]=arr[min];
            arr[min]=temp;
        }

    }
    static void print(int arr[]){
        System.out.println(" Sorted Array ");
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
            
        }

    }
    public static void main (String[] args){
        int arr[]={7,6,5,4,3,2,1};
        sort(arr);
        print(arr);

    }
}