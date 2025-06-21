class BooleanType{
    public static Boolean check(int n){ // Boolean ReturnType
        if(n%2==0){
            return true;
        }
        else {
            return false;
        }

    }
    public static void main(String[] args){
        
        boolean result=check(2);//input 2 
        System.out.println("Checked: "+result);
        

    }
}