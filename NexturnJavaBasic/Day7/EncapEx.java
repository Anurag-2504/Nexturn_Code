

class Class1{
    private String name;
    void setname(String name){
        this.name=name;
    }

    String getname(){
        return name;
    }
}

public class EncapEx {
    public static void main(String[] args) {
        Class1 obj=new Class1();
        obj.setname("Anurag");
        System.out.println(obj.getname());
    }
    
}
