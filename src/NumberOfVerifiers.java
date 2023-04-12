import java.util.Scanner;

public class NumberOfVerifiers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        //2475번 문제
        //더 간결한 소스
        int sum=0;
        for (int i=0; i<5;i++){
            int number=scan.nextInt();
            sum += number*number;
        }
        System.out.println(sum % 10);
    }
}
