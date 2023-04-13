import java.util.Scanner;

public class AIClock {
    public static void main(String[] args) {
        //2530번
        Scanner scan = new Scanner(System.in);
        int h = scan.nextInt();
        int m = scan.nextInt();
        int s = scan.nextInt();
        int t = scan.nextInt();

        //입력받은 값이 3600보다 크면 시간을 더해주고 3600으로 나눈 나머지를 t에 저장
        if (t >= 3600) {
            h += t / 3600;
            t = t % 3600;
        }
        //입력받은 값이 60보다 크면 분을 더해주고 60으로 나눈 나머지를 t에 저장
        if (t >= 60) {
            m += t / 60;
            t = t % 60;
        }
        //입력받은 값이 60보다 작으면 초를 더해줌
        if (t >= 1) {
            s += t;
        }
        //초가 60보다 크면 분을 더해주고 60으로 나눈 나머지를 초에 저장
        if (s >= 60) {
            m += s / 60;
            s = s % 60;
        }
        //분이 60보다 크면 시간을 더해주고 60으로 나눈 나머지를 분에 저장
        if (m >= 60) {
            h += m / 60;
            m = m % 60;
        }
        //시간이 24보다 크면 24로 나눈 나머지를 시간에 저장
        if (h >= 24) {
            h = h % 24;
        }
        System.out.println(h + " " + m + " " + s);
    }
}
