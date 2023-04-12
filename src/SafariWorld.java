import java.math.BigInteger;
import java.util.Scanner;

public class SafariWorld {
    public static void main(String[] args) {
        //2420번 문제
        //처음엔 단순하게 생각했으나 결과값이 -값이 나오면 안되기 때문에
        //결과값이 항상 정수로 나타나게 해주었다.
        Scanner scan=new Scanner(System.in);
        BigInteger N=scan.nextBigInteger();
        BigInteger M=scan.nextBigInteger();

        BigInteger answer=M.subtract(N);

        String posiviveAnswer=answer.abs().toString();

        System.out.println(posiviveAnswer);
    }
}
