
import java.util.Scanner;
public class Str_m{
    public static void main(String[] args) {
        System.out.println("Enter The String");
        Scanner sc = new Scanner(System.in);
        String str1 = sc.nextLine();
        System.out.println("***************************\n");
        System.out.println("23mca033\n JAISON JACOB\n 26/03/24");
        System.out.println("String Manipulation");
        System.out.println("***************************\n");
        System.out.println("Length of String = "+str1.length());
        System.out.println("Character at First position  = "+str1.charAt(0));
        System.out.println("StringContains'Col'sequence :"+str1.contains("Col"));
        System.out.println("String ends with e : "+str1.endsWith("e"));
        System.out.println("LOWERCASE : "+str1.toLowerCase());
        System.out.println("UPPERCASE : "+str1.toUpperCase());
}
}
