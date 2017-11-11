import java.util.Scanner;

public class t2 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int sum = 0 ;
        for (int i = 1 ; i <= n ; i ++){
            int a = scn.nextInt();
            sum += a ;
        }
        System.out.println(sum);
    }
}
