import java.util.Scanner;

public class AFC_Wimbledon {
    public static void main(String[] args) {
        //4299번
        Scanner scan = new Scanner(System.in);
        //정수를 입력받을 변수 sum, sub 생성
        int sum = scan.nextInt();
        int sub = scan.nextInt();

        int a = (sum + sub) / 2;
        int b = (sum - sub) / 2;

        //sum과 sub의 합이 홀수거나 sum이 sub보다 작으면 -1 출력
        if ((sum + sub) % 2 == 1 || sum < sub) {
            System.out.println(-1);
        } else {
            System.out.println(a);
            System.out.println(b);
        }
    }
}