class Practice_2{
    public static void print(){
        int n=6;
        for(int i1=n-1;i1>0;i1--){
            for(int i=i1;i<n-1;i++){
                 System.out.print("*");
            }
            for(int j1=0;j1<2*(n-i1);j1++){
                System.out.print(" ");
            }
            for(int j=i1;j<2*(n-i1);j++){
                 System.out.print(" ");
            }
            System.out.println();
        }
        
            
             for(int i1=0;i1<n-1;i1++){
            for(int i=i1;i<n-1;i++){
                 System.out.print("*");
            }
            for(int j=i1;j<2*(n-i1);j++){
                 System.out.print(" ");
            }
            System.out.println();
        }
        }
    public static void main(String [] args){
        print();
    }
}