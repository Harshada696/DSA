import java.util.*;
class Strings {
    /*
    Important String Functions:
    - length()
    - charAt()
    - compareTo()
    - equals()
    - trim()
    - replace()
    - substring()
    - endsWith()
    - contains()
    - toLowerCase()
    - toUpperCase()
    */

    public static void fun(String name) {
        String new1 = "veda";

        System.out.println("\n--- String Functions ---");
        System.out.println("Length: " + name.length());
        System.out.println("Character at index 0: " + name.charAt(0));
        System.out.println("Lexicographical Comparison: " + new1.compareTo(name));
        System.out.println("Equals: " + new1.equals(name));
        System.out.println("To Lower Case: " + name.toLowerCase());
        System.out.println("To Upper Case: " + name.toUpperCase());
        System.out.println("Substring (0 to 3): " + name.substring(0, 3));
        System.out.println("Ends with 'u': " + name.endsWith("u"));

        // Conversion
        String num = "1234";
        int integer_num = Integer.parseInt(num);
        int int_num = 1234;
        String str_num = Integer.toString(int_num);

        System.out.println("Converted to integer: " + integer_num);
        System.out.println("Converted to String: " + str_num);

        // Type checking using getClass()
        Integer boxedInt = integer_num;
        System.out.println("Type of str_num: " + str_num.getClass().getSimpleName());
        System.out.println("Type of boxedInt: " + boxedInt.getClass().getSimpleName());

        // More string functions
        System.out.println("Contains 'h': " + name.contains("h"));
        System.out.println("Index of 'h': " + name.indexOf("h"));

        String name2 = "   Harshada Mundwadkar   ";
        System.out.println("Trimmed: '" + name2.trim() + "'");
        System.out.println("Replace 'h' with 'p': " + name.replace('h', 'p'));
    }

    public static void print(String name) {
        System.out.println("\n--- Printing Characters ---");
        for (int i = 0; i < name.length(); i++) {
            System.out.println(name.charAt(i));
        }
    }

    public static void reverse(String name) {
        System.out.println("\n--- Reversed String ---");
        for (int i = name.length() - 1; i >= 0; i--) {
            System.out.print(name.charAt(i));
        }
        System.out.println(); // for newline
    }
    public static void check(String name1, String name2){
        if(name1.compareTo(name2)==0){
            System.out.println("Two strings are equal");
        }
        else{
            System.out.println("Two Strings are not equal");
        }

        
    }
    public static void palindrome(String pal){
           String reversed="";
        for(int i=pal.length()-1;i>=0;i--){
             reversed+=pal.charAt(i);
            

        }
        if(reversed.equalsIgnoreCase(pal) ){
            System.out.println("String is palindrome");
        }
        else{
            System.out.println("String is not palindrome");
        }

    }
    public static void pass_check(){// This functions checks password (mostly use in Login System)
        Scanner sc=new Scanner(System.in);
        String pass;
        int attempt=0;
        int maxattempt=3;

        do{
        System.out.println("Enter your password");
         pass=sc.nextLine();

        
        if(pass.equals("harshu")){
            System.out.println("login Succesfully");
            break;
        }
        else{
            
            attempt++;
            if(attempt<maxattempt){
                System.out.println("Try Again");
                
            }
            else{
                System.out.println("sorry ! ,no more attmepts left ");
                break;
            }
        }
        }while(true);

    }

    public static void main(String[] args) {
        String name = "harshu";
        String name1="name";
        String name2="name";
        String pal="Madam";
        print(name);
        reverse(name);
        fun(name);
        check(name1,name2);
        palindrome(pal);
        pass_check();
    }
}
