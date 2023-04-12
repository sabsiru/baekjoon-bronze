import java.util.Scanner;

public class NumberOfVerifiers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        //2475번 문제
        //5개의 숫자를 배열을 선언하고
        int a[] = new int[5];
        //입력받은 숫자의 제곱을 담을 배열을 선언하고
        int sum[]=new int[5];
        //그 합을 담을 변수를 선언한다.
        int result=0;

        //입력받은 각 숫자의 제곱을 담을 반복문
        for (int i = 0; i < 5; i++) {
            a[i] = scan.nextInt();
            sum[i]=a[i]*a[i];
        }
        //그 수들을 모두 더 할 반복문
        for(int i=0;i<sum.length;i++) {
            result += sum[i];
        }
        System.out.println(result%10);
    }
}
