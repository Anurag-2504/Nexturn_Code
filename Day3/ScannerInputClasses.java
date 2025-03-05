import java.util.*;

public class ScannerInputClasses {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter your full name");
        String full_name=sc.nextLine(); //nextLine()
        System.out.println("Enter your first name");
        String firstname=sc.next(); //next()
        System.out.println("Enter a Integer number");
        int x=sc.nextInt();     //nextInt()
        System.out.println("Enter a Double number");
        double y=sc.nextDouble();   //nextDouble()
        System.out.println("Enter a Float number");
        float z= sc.nextFloat();    //nextFloat()
        System.out.println("Enter a Long number");
        long aa= sc.nextLong();     //nextlong()
        System.out.println("Enter a Boolean value ");
        boolean flag=sc.nextBoolean();  //nextBoolean()

        System.out.println(full_name);
        System.out.println(firstname);
        System.out.println(x);
        System.out.println(y);
        System.out.println(z);
        System.out.println(aa);
        System.out.println(flag);
    }
    
}
