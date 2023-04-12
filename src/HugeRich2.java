import java.util.Scanner;
import java.math.BigInteger;

public class HugeRich2 {
    public static void main(String[] args) {
        //int 는 10^1000의 데이터를 받기에 작아서
        //biginter를 씀
        Scanner scan=new Scanner(System.in);
        BigInteger money=scan.nextBigInteger();
        BigInteger life=scan.nextBigInteger();
        scan.close();
        System.out.println(money.divide(life));
        System.out.println(money.remainder(life));
    }

}