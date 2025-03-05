import java.util.Arrays;

public class Allquestion {
    public static void main(String[] args) {
        int []arr1={1,2,3,4,5,6};
        int []arr2={1,2,3,4,5,5};

        if(arr1.length !=arr2.length){
            System.out.println("Not Equal length");
        }else{
            for(int i=0;i<arr1.length;i++){
                if(arr1[i]!=arr2[i]){
                    System.out.println("Elements are not equal");
                    break;
                }
            }
            System.out.println("Both arrays are equal in size");
        }
       System.out.println("Largest element in the array is : "+Arrays.stream(arr1).max().getAsInt());

        System.out.println("Addition of both arrays :");
        for(int i=0;i<arr1.length;i++){
            System.out.println(arr1[i]+arr2[i]);
        }

        int [][]mat1={{1,2,3},{4,5,6},{7,8,9}};
        int [][]mat2={{9,8,7},{6,5,4},{3,2,1}};

        System.out.println("Addtiion of both matrix is :");
        for(int i=0;i<mat1.length;i++){
            for(int j=0;j<mat2.length;j++){
                System.out.print((mat1[i][j]+mat2[i][j])+" ");
            }
            System.out.println();
        }
    }
    
}
