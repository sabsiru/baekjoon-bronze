import java.util.Scanner;

public class SanguenNald {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //5543
        //scanner로 가격을 입력받을 상덕버거, 중덕버거, 하덕버거, 콜라, 사이다 변수 만들기
        int sangdukBurger = scanner.nextInt();
        int jungdukBurger = scanner.nextInt();
        int hadukBurger = scanner.nextInt();
        int coke = scanner.nextInt();
        int cider = scanner.nextInt();
        //최소값을 구하기 위해 minBurger, minDrink 변수 생성
        int minBurger = Math.min(Math.min(sangdukBurger, jungdukBurger), hadukBurger);
        int minDrink=Math.min(coke, cider);

        //최소값의 합에 -50을 해서 출력
        System.out.println(minBurger+minDrink-50);

    }
}
