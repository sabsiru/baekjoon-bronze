import java.util.Scanner;

public class LineNumber {
    public static void main(String[] args) {
        //4470번
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();//N개의 줄
        scan.nextLine(); //버퍼 비우기
        for(int i = 1; i <= n; i++){
            String str = scan.nextLine();
            System.out.println(i + ". " + str);
        }
    }
}
