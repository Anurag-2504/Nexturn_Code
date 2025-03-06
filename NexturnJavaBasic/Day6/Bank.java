

public class Bank {

    String AccountHolder;
    String AccountNumber;
    int balance;

    public Bank(String AccountHolder,String AccountNumber,int balance){
        this.AccountHolder=AccountHolder;
        this.AccountNumber=AccountNumber;
        this.balance=balance;
    }

    public void deposite(int bal){
        balance+=bal;
    }
    public void withdraw(int bal){
        if(balance<0 ||balance<bal){
            System.out.println("You don't have sufficient money in your account");
        }else{
            balance-=bal;
            System.out.println("Withdraw Successful!");
        }
    }

    public static void main(String[] args) {
        Bank user1=new Bank("Anurag Ratna","1002210786123",999999);
        user1.deposite(1);
        System.out.println("User current balance : "+user1.balance);
        user1.withdraw(100000);
        System.out.println("User current balance : "+user1.balance);

    }
    
}
