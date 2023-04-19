import java.util.ArrayList;
import java.util.Scanner;

public class RepeatNumberArray {
    public static void main(String[] args) {
        //1598번
        Scanner scan = new Scanner(System.in);
        //두 수를 입력 받는다
        //입력 받은 수를 1부터 시작하도록 -1을 해준다.
        int a= scan.nextInt()-1;
        int b= scan.nextInt()-1;

        //가로의 위치 구하기
        int aX = a%4;
        int bX = b%4;

        //세로의 위치 구하기
        int aY = a/4;
        int bY = b/4;

        //두 수의 위치 차이 구하기
        int x = Math.abs(aX-bX);
        int y = Math.abs(aY-bY);

        //두 수의 위치 차이를 더해준다.
        System.out.println(x+y);




    }
}
