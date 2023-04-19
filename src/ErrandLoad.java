import java.util.Scanner;

public class ErrandLoad {
    public static void main(String[] args) {
        //5554번
        Scanner scan = new Scanner(System.in);
        int allTime=0;
        for(int i=0;i<4;i++){
            int time = scan.nextInt();
            allTime += time;
        }
        //1시간 이상의 경우는 없기때문에 간단히 나누기 60을 하면 된다.
        System.out.println(allTime/60);//분
        System.out.println(allTime%60);//초
    }
}
