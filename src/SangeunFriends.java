import java.util.Scanner;

public class SangeunFriends {
    public static void main(String[] args) {
        //5717번
        Scanner scan = new Scanner(System.in);
        //0 0이 입력될 때까지 A+B를 출력하는 반복문
        while(true){
            //상근이의 남자인 친구 수
            int a = scan.nextInt();
            //상근이의 여자인 친구 수
            int b = scan.nextInt();
            //0 0이 입력되면 반복문을 빠져나온다.
            if(a == 0 && b == 0){
                break;
            }
            System.out.println(a+b);
        }
    }
}
