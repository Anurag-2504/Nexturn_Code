



import java.util.Scanner;

public class ATMPin {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int pin = 173314;
        int c = 0;
        while(c<3){
            System.out.println("Enter pin: ");
            int upin= sc.nextInt();
            if(pin == upin){
                System.out.println("You are login");
                break;
            }
            else {
                System.out.println("Wrong pin");
                if (c != 2) {
                    System.out.println("You are left with " + (2 - c) + " attempt");
                }
            }
            c++;
        }
        if(c==3){
            System.out.println("You have exhausted the attempt allowed");
        }
    }
}

