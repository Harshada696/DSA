class Practice_2{

    public static void main(String args[]){
          int arr[]={1,2,2,2,2,4};
          int count=0;
          for(int i=0;i<arr.length-1;i++){
            if(arr[i]==arr[i+1]){
                count++;
                
            }
          }
          if(count >0){
            System.out.println("duplicate finds:"+count);

          }
          
    }
}