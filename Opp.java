
public class Opp extends Student{
    public static void main(String [] args){
        Student sc =new Student(); //creating object of class student
        sc.name="harshu";//accsesing attributes using object
        sc.age=19;
        sc.print();//acessing method of class student 
        sc.print_myname();
    



    }
}
  class Student{ // we cannot keep two calsses public in single files 
    //attributes
    String name;
    int age;

    //method
    public void print(){
        System.out.println("name is :"+name);
        System.out.println("Age is this :"+age);
    }
    public void print_myname(){
        String name1="harshu";
        System.out.println("my name is "+name1);
    }


}