import java.util.Scanner;

public class hw2 {
    public static void main(String[] args) {
        Scanner scn =new Scanner(System.in);
        String str = scn.nextLine();
        int n = scn.nextInt();
        int b = 0;
        for (int i = 0 ; i < str.length() ; i ++){
            char a = str.charAt(i);
             b = (int)a + n;
            System.out.print((char)b);
        }
        System.out.println();
    }
}
