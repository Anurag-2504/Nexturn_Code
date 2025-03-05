

public class StringClasses {
    public static void main(String[] args) {
        String name="Anurag";
        name=name+" Welcome";

        System.out.println(name);

        StringBuilder fname =new StringBuilder("Ratna");
        fname.append(" Anurag");
        System.out.println("append method "+fname);
        fname.insert(0,"Anurag");
        System.out.println("insert method "+fname);
        fname.replace(0, 1, "g");
        System.out.println("Replace method "+fname);
        fname.delete(0, 1);
        System.out.println("Delete method "+fname);
        System.out.println("Reverse String "+fname.reverse());
        System.out.println("Length of the string "+fname.length());
        System.out.println("char at"+fname.charAt(3));

        StringBuffer name1=new StringBuffer("Hello Naman");
        name1.append(" Topono");
        System.out.println(name1);



    }
}
