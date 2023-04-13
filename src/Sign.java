import java.math.BigInteger;
import java.util.Scanner;

public class Sign {
    public static void main(String[] args) {
        //1247번
        Scanner scan = new Scanner(System.in);

        //전체적으로 3번 반복
        for (int i = 0; i < 3; i++) {
            BigInteger sum = new BigInteger("0");
            //n개 만큼 정수 입력
            int n = scan.nextInt();
            for (int j = 0; j < n; j++) {
                BigInteger a = scan.nextBigInteger();
                //sum에 입력받은 정수를 더함
                sum = sum.add(a);
            }
            //sum이 0이면 0출력, sum이 양수면 +출력, sum이 음수면 -출력
            if (sum.equals(BigInteger.ZERO)) {
                System.out.println(0);
            } else if (sum.compareTo(BigInteger.ZERO) == 1) {
                System.out.println("+");
            } else {
                System.out.println("-");
            }
        }
            scan.close();
    }
}

