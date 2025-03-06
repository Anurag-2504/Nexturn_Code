

public class ConstructorEx {
    String name;
    int num;
    public ConstructorEx(String name,int num){
        this.name=name;
        this.num=num;
    }
    public static void main(String[] args) {
        ConstructorEx obj = new ConstructorEx("Anurag",21);
        System.out.println(obj.name+" "+obj.num);
    }
    
}
