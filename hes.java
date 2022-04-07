import java.util.Scanner;

public class hes {
    public static void main(String[] args) {
        int r;
        Scanner a = new Scanner(System.in);
        System.out.print("dairenin yarıçapını giriniz:");
        r = a.nextInt();
        System.out.print("alfa açısını giriniz:");
        int acı = a.nextInt();
        double pi= 3.14;
        double alan = (pi*(r*r)*acı)/360;
        System.out.print("daire diliminin alanı:"+ alan);

    }
}
