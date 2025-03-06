

class Student{
    void speak(){
        System.out.println("Yes students are public speakers");
    }
}

class Teacher extends Student{

    void teach(){
        System.out.println("Yes they are teachers");
    }
}


// class Principle extends Teacher{
//     void manage(){
//         System.out.println("Principle Mam");
//     }
// }

class Principle extends Student{
    void manage(){
        System.out.println("Principle Mam");
    }
}
public class InheritanceEx {
    public static void main(String[] args) {
        Teacher obj=new Teacher();
        obj.teach();
        obj.speak();

        Principle obj2=new Principle();
       
        obj2.speak();
        obj2.manage();
    }
    
}
