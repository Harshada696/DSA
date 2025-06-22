class SortInDescendingOrder{//selection sort in descending order 
    public static void SelectionSort(int arr[]){
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
    public static void print(int arr[]){
        for(int i=arr.length-1;i>=0;i--){//here we start from last element to 1st (descending order)
            System.out.println(arr[i]);
        }
    }

    public static void main(String[] args){
        int arr[]={1,2,3,6,5,4};
        SelectionSort(arr);
        print(arr);


    }
}