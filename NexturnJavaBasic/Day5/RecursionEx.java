

public class RecursionEx {

    static int fact(int n){
        if(n==0){
            return 1;
        }
        return n*fact(n-1);
    }

    static int sum=1;
    static int factUsingLoop(int n){
        for(int i=1;i<=n;i++){
            sum*=i;
        }
        return sum;
    }
    public static void main(String[] args) {
        System.out.println(fact(5));
        System.out.println(factUsingLoop(5));
    }
    
}
