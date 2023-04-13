import java.util.Scanner;

public class AfterParty {
    public static void main(String[] args) {
        //2845번
        Scanner scan = new Scanner(System.in);

        int L = scan.nextInt();
        int p = scan.nextInt();
        int people = L * p;

        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();
        int d = scan.nextInt();
        int e = scan.nextInt();

        int ar = a - people;
        int br = b - people;
        int cr = c - people;
        int dr = d - people;
        int er = e - people;

        System.out.println(ar);
        System.out.println(br);
        System.out.println(cr);
        System.out.println(dr);
        System.out.println(er);
        scan.close();
    }
}
