

public class ConstructorEx {
    String name;
    int num;
    public ConstructorEx(String name,int num){
        this.name=name;
        this.num=num;
    }

    public ConstructorEx(){
        name="Naman";
        num=123456;
    }
    public static void main(String[] args) {
       ConstructorEx obj1 = new ConstructorEx();
        ConstructorEx obj2 = new ConstructorEx("Anurag",21);
        System.out.println(obj1.name+" "+obj1.num);
        System.out.println(obj2.name+" "+obj2.num);
    }
    
}
