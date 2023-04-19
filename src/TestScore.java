import java.util.Scanner;

public class TestScore {
    public static void main(String[] args) {
        //5596번
        Scanner scan = new Scanner(System.in);
        //민국이의 총점
        int minScore = 0;
        //만세의 총점
        int manScore = 0;
        //4개의 점수를 입력받아서 더한다.
        for (int i = 0; i < 4; i++) {
            int score = scan.nextInt();
            minScore += score;
        }
        //4개의 점수를 입력받아서 더한다.
        for (int i = 0; i < 4; i++) {
            int score = scan.nextInt();
            manScore += score;
        }
        //민국이와 만세의 점수를 비교
        int win = Math.max(minScore, manScore);
        //만약 두 점수가 같다면 민수의 점수를 출력
        if (minScore == manScore) {
            System.out.println(minScore);
            //아니라면 더 큰 점수를 출력
        } else {
            System.out.println(win);
        }
    }
}
