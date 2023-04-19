import java.util.Scanner;

public class AverageScore {
    public static void main(String[] args) {
        //10039번
        Scanner scan = new Scanner(System.in);
        int sum = 0;
        for(int i=0; i<5; i++){
            int score =scan.nextInt();
            if(score < 40){
                score = 40;
            }
            sum += score;
        }
        System.out.println(sum/5);
    }
}
