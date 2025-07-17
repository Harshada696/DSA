class Practice_2{
        public static void febo(){
            int n=5;
            int num1=0;
            int num2=1;
            int num3;
            System.out.println(num1);
            System.out.println(num2);
            
            for(int i=2;i<n;i++){
                 num3=num1+num2;
                 System.out.println("febo series :"+ num3);
                num1=num2;
                num2=num3;


            }
            
        }

    public static void main(String args[]){
        febo();

       
    }
}
