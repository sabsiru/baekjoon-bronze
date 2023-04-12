import java.util.Scanner;

public class LowerUpper {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        //문자 입력
        String word = scan.nextLine();
        //입력 받은 값을 변환해서 넣을 변수 선언
        String converted = "";

        // 단어 1개씩 분리해서 차례대로 대소문자 구분후 변경할 반복문
        for (int i = 0; i < word.length(); i++) {
            char ch = word.charAt(i);
            if (Character.isUpperCase(ch)) {
                converted += Character.toLowerCase(ch);
            } else {
                converted += Character.toUpperCase(ch);
            }
        }
        System.out.println(converted);

    }
}
