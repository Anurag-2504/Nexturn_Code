

abstract class DataBase{
    abstract void connecting();
    void disconnect(){
        System.out.println("Disconnected from DataBase");
    }
}
class MyDataBase extends DataBase{
    void connecting(){
        System.out.println("Connected to DataBase");
    }
}
public class Abstract2Ex {
    public static void main(String[] args) {
        MyDataBase obj1= new MyDataBase();
        obj1.connecting();
        obj1.disconnect();
    }
}
