

public class Student {
    String name,roll_no,Grade;

    public Student(String name, String roll_no, String Grade){
        this.name=name;
        this.roll_no=roll_no;
        this.Grade=Grade;
    }
    public void display(){
        System.out.println("Name of the student : "+name);
        System.out.println("Roll no is : "+roll_no);
        System.out.println("Grade of the student is ; "+Grade);
    }

    public static void main(String[] args) {

       Student naman = new Student("Naman Topono", "78", "A");
       Student anurag = new Student("Anurag Ratna", "21", "A");

       System.out.println("Student Details : ");
       naman.display();
       anurag.display();

    }
    
}
