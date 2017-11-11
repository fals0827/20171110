import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int a = scn.nextInt();
        int b = scn.nextInt();
        int c = scn.nextInt();
        int sum = 0 ;
        if (a <= c && c <= b ){
            for ( int i = a ; i <= b ; i += c){
                if (i % c == 0){
                    sum += i;
                }
            }
            System.out.println(sum);
        }
    }
}
