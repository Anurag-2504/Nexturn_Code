

abstract class Employee{
    String name;
    int empid;

    abstract void salary();
    
    void showDetails(String name,int empid){
        System.out.println("EmpId is :" +empid);
        System.out.println("Name : "+name);
    }
}
class FullTimeEmployee extends Employee{
    int sal=50000;
    void salary(){
        System.out.println("Salary of the Full time employee is : ₹"+sal);
    }

}

class PartTimeEmployee extends Employee{
    int hour=70;
    void salary(){
        System.out.println("Salary of the Part time Employee is : ₹"+(hour*500));
    }

}
public class EmployeeEx {
    public static void main(String[] args) {
        FullTimeEmployee full= new FullTimeEmployee();
        PartTimeEmployee part= new PartTimeEmployee();

        full.showDetails("Anurag Ratna",101);
        full.salary();  
        System.out.println();
        part.showDetails("Naman Topono",102);
        part.salary();
    }
}
