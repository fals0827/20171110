import java.util.Scanner;

public class hw3 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String str = scn.nextLine();
        int sum = 0 ;
        for (int i = 0 ; i < str.length(); i ++){
            char a = str.charAt(i);
            sum += (int) a -48 ;
        }
        System.out.println(sum);
    }
}
