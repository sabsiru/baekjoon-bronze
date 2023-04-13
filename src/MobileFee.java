import java.util.Map;
import java.util.Scanner;

public class MobileFee {
    public static void main(String[] args) {
        //1267번
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scan.nextInt();
        }
        scan.close();
        //y는 30초마다 10원, m은 60초마다 15원
        int y = 0;
        int m = 0;
        for (int i = 0; i < n; i++) {
            y += (arr[i] / 30 + 1) * 10;
            m += (arr[i] / 60 + 1) * 15;
        }
        int min = Math.min(y, m);
        if (y == m) {
            System.out.println("Y " + "M " + min);
        } else if (min == y) {
            System.out.println("Y " + y);
        } else {
            System.out.println("M " + m);
        }
    }
}
