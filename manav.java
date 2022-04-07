import java.util.Scanner;

public class manav {
    public static void main(String[] args) {
        double arm, elm, dom, muz, pat;
        Scanner inp = new Scanner(System.in);
        System.out.print("alacağınız armut miktarini kilogram cinsinden giriniz:");
        arm = inp.nextDouble();
        System.out.print("alacağınız elma miktarini kilogram cinsinden giriniz:");
        elm = inp.nextDouble();
        System.out.print("alacağınız domates miktarini kilogram cinsinden giriniz:");
        dom = inp.nextDouble();
        System.out.print("alacağınız muz miktarini kilogram cinsinden giriniz:");
        muz = inp.nextDouble();
        System.out.print("alacağınız patlıcan miktarini kilogram cinsinden giriniz:");
        pat = inp.nextDouble();

        double armTut = 2.14;
        double elmTut = 3.67;
        double domTut = 1.11;
        double muzTut = 0.95;
        double patTut = 5;

        double sonArm= arm*armTut;
        double sonElm= elm * elmTut;
        double sonDom= dom*domTut;
        double sonMuz= muz*muzTut;
        double sonPat= pat*patTut;
        System.out.print("toplam tutar:"+sonArm+sonElm+sonDom+sonMuz+sonPat);



    }
}
