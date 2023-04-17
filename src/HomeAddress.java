import java.util.Scanner;

public class HomeAddress {
    public static void main(String[] args) {
        //1284번
        Scanner scan = new Scanner(System.in);
        //각 숫자 사이에는 1cm의 여백이 들어가야 한다.
        //1은 2cm의 너비 0은 4cm, 나머지는 3cm를 차지한다
        //호수판의 경계와 숫자 사이에는 1cm의 여백이 들어가야한다.

        while (true) {
            String str = scan.nextLine();
            if (str.equals("0")) { //0이 입력되면 종료
                break;
            }
            int width = 2; //양 옆의 여백 1cm + 1cm
            width += str.length() - 1; //숫자 사이의 여백
            for (int i = 0; i < str.length(); i++) {
                if (str.charAt(i) == '1')
                    width += 2;
                else if (str.charAt(i) == '0')
                    width += 4;
                else
                    width += 3;
            }
            System.out.println(width);
        }

    }
}


