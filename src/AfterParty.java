import java.util.Scanner;

public class AfterParty {
    public static void main(String[] args) {
        //2845번 배열 사용
        Scanner scan = new Scanner(System.in);

        int l = scan.nextInt(); //사람의수
        int p = scan.nextInt(); //면적
        int people = l * p; //총 참가자

       int news[]=new int[5]; //기사의 참가자수를 담을 배열
        int result[]=new int[5]; //기사와 참가자 수의 차이를 담을 배열
       for (int i = 0; i < news.length; i++) {
           news[i] = scan.nextInt();
           result[i]= news[i]-people;
       }
       scan.close();
       for(int i=0; i< result.length;i++){
           System.out.println(result[i]);
       }
    }
}
