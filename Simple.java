class Simple{
    public static void print_table(){
        int a=2;
        
        for(int i=1;i<=10;i++){
            System.out.println("2 *"+i+"="+a*i);
        }

    }
    public static void main(String [] args){
        print_table();
        int arr[]={7,6,5,4,3,2,1};
        int search=4;
        int flag=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==search){
                flag=1;
                System.out.println("elemt nfound at indexx :"+i);
                break;
            }
        }
        
    }
}