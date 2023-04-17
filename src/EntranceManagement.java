import java.util.Scanner;

public class EntranceManagement {
    public static void main(String[] args) {
        //5524번
        Scanner scan = new Scanner(System.in);
        int number = scan.nextInt();
        scan.nextLine();
        for(int i=0;i<number;i++){
            String str = scan.next();
            str = str.toLowerCase();
            System.out.println(str);
        }
    }
}
