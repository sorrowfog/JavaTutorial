/**
 * Created by WinHan on 1/9/18.
 */
public class Main {
    public static void main(String[] args) {

        long x = 5, y = 6;
        long z = x + y;
        System.out.println(z);
        boolean w = true;
        boolean h = false;
        System.out.println(w);
        System.out.println(++x);
        System.out.println(z+2);
        System.out.println(x);
        see("win", "han");
        abc("is", " saut paw");

    }

    public static void see(String q, String l) {
        System.out.print(q);
        System.out.print(" " + l);
    }

    public static void abc(String n, String m) {

        System.out.print(" " + n);
        System.out.print(m);
    }


}

