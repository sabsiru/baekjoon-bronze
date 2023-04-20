import java.util.Scanner;

public class DistributedProcessing {
    public static void main(String[] args) {
        //1009번
        Scanner scan = new Scanner(System.in);
        //테스트 케이스의 개수
        int t = scan.nextInt();
        for(int i = 0; i < t; i++){
            //a^b
            int a = scan.nextInt();
            int b = scan.nextInt();
            //a의 마지막 자리 수
            int result = 1;
            //데이터가 너무 커지는 것을 방지하기 위해 계속 10으로 나눈 나머지를 구한다.
            for(int j = 0; j < b; j++){
                result *= a;
                result %= 10;
            }
            if(result == 0){
                System.out.println(10);
            }else{
                System.out.println(result);
            }
        }
    }
}
