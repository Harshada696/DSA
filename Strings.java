class Strings{
    public static void print(String name){
        
        for(int i=0;i<name.length();i++)
        {
            System.out.println(name.charAt(i));
        }
    }
    public static void reverse(String name){
        for(int i=name.length()-1;i>=0;i--){
            System.out.print(name.charAt(i));
        }
    }
    public static  void main(String[] args){
        String name="harshu";
        
        reverse(name);
        
    }
}