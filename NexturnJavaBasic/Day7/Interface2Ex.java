

interface UPIPayments{
    void upiTransfer();
}
interface CreditCardPayments{
   
    void cardTransfer();
}
class PaymentGateway implements UPIPayments,CreditCardPayments{
    public void upiTransfer(){
        System.out.println("UPI Payment Successful");
    }

    public void cardTransfer(){
        System.out.println("Card Payment Successful");
    }
}



public class Interface2Ex {
    public static void main(String[] args) {
        PaymentGateway pay= new PaymentGateway();
        pay.upiTransfer();
        pay.cardTransfer();
    }
    
}
