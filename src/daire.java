import java.util.Scanner;
public class daire {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        int r;
        double pi = 3.14;

        System.out.print("lütfen Dairenin yarı çapını giriniz :");
        r  = inp.nextInt();

        double cevre = pi * r *r;
        double alan = 2 * pi * r;
        System.out.println("Dairenin alanı : " + cevre);
        System.out.println("Dairenin çevresi :"+ alan);
    }
}