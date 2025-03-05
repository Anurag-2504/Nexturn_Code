

public class ArrayEx {
    public static void main(String[] args) {
        //  1 - Declaration
        //  2 - Size defining 
        //  3 - Initializing
        int[] arr = {1,2,3,4,5};
        //  4 - Interation over the array
        for(int i=arr.length-1;i>=0;i--){
            System.out.println("Value in Array: "+arr[i]);
        }
        //for each loop
        for (int i : arr) {
            System.out.println(i);
        }

        System.out.println("of the array : ");
        

    }
    
}
