
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class BufferEx {
    public static void main(String[] args) throws IOException {
        
        InputStreamReader name = new InputStreamReader(System.in);
       
        
        BufferedReader br = new BufferedReader(name);
        System.out.print("Enter your name: ");
        String myname = br.readLine(); // Reads an entire line
        System.out.println("Hello, " + myname + "!");

        char c=br.readLine().charAt(3);

        System.out.println(c);

        
        System.out.println("Enter a Integer number");
        int x=Integer.parseInt(br.readLine());     //nextInt()
        System.out.println("Enter a Double number");
        double y=Double.parseDouble(br.readLine());   //nextDouble()
        System.out.println("Enter a Float number");
        float z= Float.parseFloat(br.readLine());    //nextFloat()
        System.out.println("Enter a Long number");
        long aa= Long.parseLong(br.readLine());     //nextlong()
        System.out.println("Enter a Boolean value ");
        boolean flag=Boolean.parseBoolean(br.readLine());  //nextBoolean()


        System.out.println(c);
        System.out.println(x);
        System.out.println(y);
        System.out.println(z);
        System.out.println(aa);
        System.out.println(flag);

    }
}