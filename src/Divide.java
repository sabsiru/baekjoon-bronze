import java.util.Scanner;

public class Divide {
    public static void main(String[] args) {
        //1075번
        Scanner scan = new Scanner(System.in);

        //두 정수 N과 F가 주어진다.
        int n = scan.nextInt();
        int f = scan.nextInt();

        //N의 가장 뒤 두 자리를 새로운 정수로 만든다.
        int newN = n - (n % 100);
        //새로운 정수의 일의 자리부터 1씩 증가시키면서 F로 나누어 떨어지는 수를 찾는다.
        for (int i = 0; i < 100; i++) {
            if ((newN + i) % f == 0) {
                //만약 나누어 떨어진다면, 그 수의 일의 자리를 출력한다.
                if (i < 10) {
                    System.out.println("0" + i);
                } else {
                    System.out.println(i);
                }
                break;
            }
        }
    }
}
