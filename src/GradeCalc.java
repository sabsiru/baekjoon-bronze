import java.util.Scanner;

public class GradeCalc {
    public static void main(String[] args) {
        //아스키 코드를 활용한 풀이법
        //A=65, B=66, C=67, D=68
     Scanner scan=new Scanner(System.in);      
     String grade=scan.next();

     //F의 경우를 먼저 선언
     if(grade.equals("F")){
         System.out.println(0.0);
         return;
     }
     double score=0.0;
     //charAt으로 입력받은 값의 첫번째 자리를 추출
        //A의 아스키코드 값은 65이기 때문에 69-65= 4
        score += 69 - grade.charAt(0);

        //입력 받은 값의 2번째 값이 +냐 -냐에 따라서 더하고 빼준다.
        switch (grade.charAt(1)) {
         case '+':
             score +=0.3;
             break;
         case '-':
             score -=0.3;
             break;
     }
        System.out.println(score);
    }
}
