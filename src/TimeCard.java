import java.util.Scanner;

public class TimeCard {
    public static void main(String[] args) {
        //5575번
        Scanner scan = new Scanner(System.in);

        for (int i = 0; i < 3; i++) {
            //출근시간
            int aHour = scan.nextInt();
            int aMinute = scan.nextInt();
            int aSecond = scan.nextInt();

            //퇴근시간
            int bHour = scan.nextInt();
            int bMinute = scan.nextInt();
            int bSecond = scan.nextInt();

            //근무한 시간
            int workHour = bHour - aHour;
            int workMinute = bMinute - aMinute;
            int workSecond = bSecond - aSecond;

            //초가 마이너스인 경우
            if (workSecond < 0) {
                workSecond += 60;
                workMinute -= 1;
            }
            //분이 마이너스인 경우
            if (workMinute < 0) {
                workMinute += 60;
                workHour -= 1;
            }
            //시간이 마이너스인 경우
            if (workHour < 0) {
                workHour += 24;
            }
            System.out.println(workHour + " " + workMinute + " " + workSecond);
        }
    }
}
