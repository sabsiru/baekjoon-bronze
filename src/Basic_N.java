import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Basic_N {
    //2742번 BufferReader 사용
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String m=br.readLine();
        int n=Integer.parseInt(m);

        br.close();
        for(int i=n; i>0; i--) {
            System.out.println(i);
        }
    }
}
