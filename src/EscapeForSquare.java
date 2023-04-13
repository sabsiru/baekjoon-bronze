import java.util.Scanner;

public class EscapeForSquare {
    public static void main(String[] args) {
        //1085번
        Scanner scan = new Scanner(System.in);
        int x = scan.nextInt();
        int y = scan.nextInt();
        int w = scan.nextInt();
        int h = scan.nextInt();

        int min = Math.min(Math.min(x, y), Math.min(w - x, h - y));
        System.out.println(min);

    }
}
