import java.util.Scanner;

public class Ball {
    public static void main(String[] args) {
        //1547번
        Scanner scan = new Scanner(System.in);
        int m = scan.nextInt();//컵을 바꾼 횟수
        int ball = 1;//공의 위치
        for(int i = 1; i <= m; i++){
            int x = scan.nextInt();
            int y = scan.nextInt();
            if(ball == x){ //공의 위치가 x와 같다면
                ball = y;
            }else if(ball == y){//공의 위치가 y와 같다면
                ball = x;
            }
            //둘다 아니면 공의 위치는 변하지 않는다.
        }
        System.out.println(ball);
    }
}
