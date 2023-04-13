import java.util.Scanner;

public class CountVowels {
    public static void main(String[] args) {
        //1264번 문제
        Scanner scan = new Scanner(System.in);
        while (true) {
            String input = scan.nextLine();
            if (input.equals("#")) {
                break;
            } else {
                int count = 0;
                for (int i = 0; i < input.length(); i++) {
                    char ch = input.charAt(i);
                    if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') {
                        count++;
                    }
                }
                System.out.println(count);
            }
        }
    }
}



