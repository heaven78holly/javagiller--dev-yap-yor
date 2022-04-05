import java.util.Scanner;
public class kdv {
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        System.out.println("ürün fiyatını girin:");
        double tutar= a.nextDouble();
        double son = (tutar>1000 )? 1.08: 1.18;
        double tut = tutar*son;
        System.out.println("kdvsiz fiyat:"+ tutar);
        System.out.println("kdv ile fiyat:"+ tut);
        System.out.println("kdv oranı:"+ (son - 1));

        System.out.println("kdv tutarı:"+(tut - tutar));



    }
}
