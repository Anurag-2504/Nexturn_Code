
import java.io.Console;
public class ConsoleEx {
    public static void main(String[] args) {
        Console console = System.console();
        if (console == null) {
            System.out.println("No console available.");
            return;
        }
        String uname = console.readLine("Enter your username: ");
        char[] passwordChars = console.readPassword("Enter your password: ");
        String pass = new String(passwordChars); 
        System.out.println("Username: " + uname);
        System.out.println("Password entered securely!");

        System.out.println("Your UserName is : "+uname);
        System.out.println("Your password is : "+pass);
    }
   
}
