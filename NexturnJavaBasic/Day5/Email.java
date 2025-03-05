package Day5;
public class Email {
    public static void sendemail(String name,String company){
        String emaildraft="Dear "+name+" Welcome to "+company+" Thank you";
        System.out.println(emaildraft);
    }
    public static void main(String[] args) {
        Email.sendemail("Naman Topono", "Nexturn");
    }    
}
