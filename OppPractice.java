class OppPractice{
    public static void main (String args[]){
        String name="madam";
        String reversed =new StringBuilder(name).reverse().toString();
        if(name.equals(reversed)){
            System.out.println("string is palindrome");
        }
        else{
             System.out.println("string is not  palindrome");

        }
    }
} 