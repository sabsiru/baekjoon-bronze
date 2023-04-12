import java.math.BigInteger;
import java.util.Scanner;

public class LongCalc {
    public static void main(String[] args) {
        //2338
        Scanner scan=new Scanner(System.in);
        BigInteger a=scan.nextBigInteger();
        BigInteger b=scan.nextBigInteger();

        System.out.println(a.add(b));
        System.out.println(a.subtract(b));
        System.out.println(a.multiply(b));

    }
}
