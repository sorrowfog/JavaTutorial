import java.util.Scanner;

/**
 * Created by WinHan on 1/9/18.
 */
public class TwoInputs {
    public static void main(String[] args) {
        int x = 10;
        Scanner sc = new Scanner(System.in);
        int d = sc.nextInt();

            if ((d % 2) == 0){
                int c = x + d;
            System.out.print(c);
        }
        else{
            int w = x * d;
            System.out.print(w);

        }
    }
}
