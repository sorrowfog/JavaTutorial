import java.util.Scanner;

/**
 * Created by WinHan on 1/9/18.
 */
public class TrueOrFalse {
    public static void main(String[] args) {
        boolean a = true;
        boolean b = false;

        Scanner sc = new Scanner(System.in);
        int d=sc.nextInt();
        if ((d % 2) == 0){

            System.out.println(d%2);

            System.out.print(a);

        }else {
            System.out.println(b);

        }
    }
}