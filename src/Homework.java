import java.util.Scanner;

public class Homework {
    public static void main(String[] args) {
        //5532번
        Scanner scan = new Scanner(System.in);
        double L= scan.nextInt(); //방학의 총 일수
        double A= scan.nextInt();//국어의 총 페이지
        double B= scan.nextInt();//수학의 총 페이지
        double C= scan.nextInt();//하루에 풀수있는 국어 페이지
        double D= scan.nextInt();//하루에 풀수있는 수학 페이지


        double korean=A/C; //국어를 풀수있는 일수
        if(korean==0||korean%(A/C)>0) {
            korean ++; //국어를 하루에 1페이지씩 풀수있는 경우 나머지가 0보다 크면 하루를 더해줌
        }
        double math=B/D; //수학을 풀수있는 일수
        if(math==0||math%(B/D)>0) {
            math  ++; //수학을 하루에 1페이지씩 풀수있는 경우 나머지가 0보다 크면 하루를 더해줌
        }

       double remain=L-Math.max(korean,math); //둘중에 더 오래걸리는 숙제를 기준으로 방학의 남은 일수를 구함
        
        System.out.println((int)remain);
    }
}
