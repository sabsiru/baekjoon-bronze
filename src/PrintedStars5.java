import java.util.Scanner;

public class PrintedStars5 {
    public static void main(String[] args) {
        //2442번
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        for (int i = 1; i <= n; i++) {//공백을 찍는 반복문
            for (int j = n; j > i; j--) {
                System.out.print(" ");
            }
            for (int k = 1; k <= 2 * i - 1; k++) {//별을 찍는 반복문
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
