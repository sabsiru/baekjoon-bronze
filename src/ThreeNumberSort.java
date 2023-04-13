import java.util.Scanner;

public class ThreeNumberSort {
    public static void main(String[] args) {
        //2752번
        Scanner scan = new Scanner(System.in);

        int a=scan.nextInt();
        int b=scan.nextInt();
        int c=scan.nextInt();

        //각각 최소와 최대값을 구하는방법
        int min=Math.min(Math.min(a,b),c);
        int max=Math.max(Math.max(a,b),c);
        //모든값을 더하고 최대와 최소를 빼면 중간값이 나옴
        int mid=a+b+c -min - max;

        System.out.println(min);
        System.out.println(mid);
        System.out.println(max);

    }

}
