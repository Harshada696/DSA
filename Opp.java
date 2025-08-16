// Main class
public class Opp extends Student {
    public static void main(String[] args) {
        Constructor c=new Constructor("name",1234);
        c.print();
        Prasad_data ps =new Prasad_data();
        ps.name="prasad";
        ps.type="polite boy";
        ps.roll_no=123;
        ps.print_info();
        // Object of Student
        Student sc = new Student();
        sc.name = "harshu";
        sc.age = 19;
        sc.print();
        sc.print_myname();

        // Object of Student_info
        Student_info st = new Student_info();
        st.displayInfo();

    }
}

// Supporting class
class Student_info {
    String name = "harshu";
    int roll_no = 8042;
    double marks = 90.60;

    // Method to print student info
    public  void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Roll No: " + roll_no);
        System.out.println("Marks: " + marks);
    }
}

// Another supporting class
class Student {
    String name;
    int age;

    public void print() {
        System.out.println("Name is: " + name);
        System.out.println("Age is: " + age);
    }

    public void print_myname() {
        String name1 = "harshu";
        System.out.println("My name is: " + name1);
    }
}

class Prasad_data{
    String name;
    int roll_no;
    String type;
    public void print_info(){
        System.out.println("writing..");
        System.out.println("name is " + name + "roll no is :" + roll_no +" his type :" +type);

    }

}
class Constructor{
    int number=12;
    String name="Harshada";
     Constructor(String name , int number){
        this.number=number;
        this.name=name;

     }
     public void print(){
        System.out.println(name);
        System.out.println(number);
     }

}