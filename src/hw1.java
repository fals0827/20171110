import java.text.DecimalFormat;
import java.util.Scanner;

public class hw1 {
    public static void main(String[] args) {
        DecimalFormat df = new DecimalFormat("0.00");
        Scanner scn = new Scanner(System.in);
        float a1 =scn.nextFloat();
        float a2 =scn.nextFloat();
        float a3 =scn.nextFloat();
        float a4 =scn.nextFloat();
        float a5 =scn.nextFloat();
        float a6 =scn.nextFloat();
        float a7 =scn.nextFloat();
        float a8 =scn.nextFloat();
        float a9 =scn.nextFloat();
        float a10 =scn.nextFloat();
        float sum1 = Math.max(Math.max(Math.max(Math.max(Math.max(Math.max(Math.max(Math.max(Math.max(a1,a2),a3),a4),a5),a6),a7),a8),a9),a10);
        float sum2 = Math.min(Math.min(Math.min(Math.min(Math.min(Math.min(Math.min(Math.min(Math.min(a1,a2),a3),a4),a5),a6),a7),a8),a9),a10);
        System.out.println("max=" + df.format(sum1));
        System.out.println("min=" + df.format(sum2));
    }
}
