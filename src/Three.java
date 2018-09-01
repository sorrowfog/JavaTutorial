import java.util.Scanner;

/**
 * Created by WinHan on 1/9/18.
 */
public class Three {
    public static void main(String []args){
        boolean a=true;
        boolean b=false;
        long x=3;
        long z=2;
        long y=2+z;
        Scanner l=new Scanner(System.in);
        z=l.nextLong();
        y=2+z;
        if(x==y){


            System.out.println(a);
        }else{
            System.out.println(b);
        }
    }
}
