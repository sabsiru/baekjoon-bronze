import java.util.Scanner;

public class PrintedStars {
    public static void main(String[] args) {
        //2440번
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        for (int i = 1; i <= n; i++) {

            for (int j = n; j >= i; j--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

