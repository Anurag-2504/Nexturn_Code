public class Pattern {
    public static void main(String[] args) {

        System.out.println("\nPattern 1");
        for(int i=1;i<6;i++)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print(j+" ");
            }
            System.out.println();
        }

        System.out.println("\nPattern 2");
        int r = 3;  
        int num = 1;   

        for (int i = 1; i <= r; i++) {

            for (int j = 1; j <= r - i; j++) {
                System.out.print("  ");
            }
     
            for (int j = 1; j <= (2 * i - 1); j++) {
                System.out.print(num + " ");
                num++;
            }

            System.out.println();
        }

        System.out.println("\nPattern 3 ");
        for(int i=1;i<=3;i++)
	    {
	        System.out.println(i);
	        for(int j=1;j<=4;j++)
	        {
	            System.out.print(j+" ");
	        }
	         System.out.println();
	    }
    }
}
