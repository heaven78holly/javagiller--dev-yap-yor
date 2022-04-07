import java.util.Scanner;
import java.lang.String;

public class nota {
    public static void main(String[] args) {
        int mat,fizik,kimya,tur,tarih,muz;
        Scanner a = new Scanner(System.in);
        System.out.println("matematik notunuz :");
        mat = a.nextInt();
        System.out.println("kimya notunuz:");
        kimya = a.nextInt();
        System.out.println("fizik notunuz:");
        fizik= a.nextInt();
        System.out.println("türkçe notunuz:");
        tur= a.nextInt();
        System.out.println("tarih notunuz:");
        tarih= a.nextInt();
        System.out.println("müzik notunuz:");
        muz= a.nextInt();
        int top= (mat+ fizik+kimya + tur+ tarih + muz);
        double sonuc= top/6.0;
        String not = (sonuc>=60)? "geçtiniz": "kaldınız";
        System.out.println(not);

    }
}