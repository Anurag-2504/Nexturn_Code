

interface Student{
    int num=50;
    void speak();
}
class Trainers implements Student{
    public void speak(){
        System.out.println("Student can speak and its marks : "+num);
    }
}
public class InterfaceEx {
    public static void main(String[] args) {
        Trainers obj1= new Trainers();
        obj1.speak();
        
    }
}
