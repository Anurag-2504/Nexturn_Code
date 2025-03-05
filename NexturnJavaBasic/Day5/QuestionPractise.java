

public class QuestionPractise {

    static int Fibonacci(int num){
        if(num<=1){
            return num;
        }
        return Fibonacci(num-1)+ Fibonacci(num-2);
    }

    static int sumOfDigit(int num){
        if(num<=0){
            return 0;
        }

        return (num%10+sumOfDigit(num/10));
    }
    
    public static void main(String[] args) {
        // 1- Fibonacci Series using recursoin
        for(int i=1;i<10;i++){
        System.out.print(" "+Fibonacci(i));
        }
        System.out.println("\nSum of Number is :"+sumOfDigit(12345));

    }
    
}
