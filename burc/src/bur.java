import java.util.Scanner;

public class bur {
    public static void main(String[] args) {
        Scanner i = new Scanner(System.in);
        String b = "balık";
        String k = "koç";
        String bo = "boğa";
        String ik = "ikizler";
        String y = "yengeç";
        String as = "aslan";
        String ba = "başak";
        String t = "terazi";
        String ak = "akrep";
        String ya = "yay";
        String o = "oğlak";
        String ko = "kova";

        System.out.print("doğduğunuz ayı sayı cinsinden giriniz:");
        int ay = i.nextInt();
        System.out.print("doğduğunuz günü giriniz:");
        int gun = i.nextInt();
        if (ay == 1) {
            if (gun >= 1 && gun <= 21) {
                System.out.print("Burcunuz:" + o);
            } else if (gun <= 31) {
                System.out.print("Burcunuz:." + ko);
            } else {
                System.out.print("geçersiz giriş");
            }
        } else if (ay == 2) {
            if (gun >= 1 && gun <= 19) {
                System.out.print("Burcunuz:" + ko);
            } else if (gun <= 29) {
                System.out.print("Burcunuz:" + b);
            } else {
                System.out.print("geçersiz giriş");
            }

        } else if (ay == 3) {
            if (gun >= 1 && gun <= 20) {
                System.out.print("Burcunuz:" + b);
            } else if (gun <= 31) {
                System.out.print("Burcunuz:" + k);
            } else {
                System.out.print("geçersiz giriş");
            }
        } else if (ay == 4) {
            if (gun >= 1 && gun <= 20) {
                System.out.print("Burcunuz:" + k);
            } else if (gun <= 30) {
                System.out.print("Burcunuz:" + bo);
            } else {
                System.out.print("geçersiz giriş.");
            }
        } else if (ay == 5) {
            if (gun >= 1 && gun <= 21) {
                System.out.print("Burcunuz:" + bo);
            } else if (gun <= 31) {
                System.out.print("Burcunuz:" + ik);
            } else {
                System.out.print("geçersiz giriş");
            }
        } else if (ay == 6) {
            if (gun >= 1 && gun <= 22) {
                System.out.print("Burcunuz:" + ik);
            } else if (gun <= 30) {
                System.out.print("Burcunuz:" + y);
            } else {
                System.out.print("geçersiz giriş");
            }
        } else if (ay == 7) {
            if (gun >= 1 && gun <= 23) {
                System.out.print("Burcunuz:" + y);
            } else if (gun <= 31) {
                System.out.print("Burcunuz:" + as);
            } else {
                System.out.print("geçersiz giriş");
            }
        } else if (ay == 8) {
            if (gun >= 1 && gun <= 22) {
                System.out.print("Burcunuz:" + as);
            } else if (gun <= 31) {
                System.out.print("Burcunuz:" + ba);
            } else {
                System.out.print("geçersiz giriş");
            }
        } else if (ay == 9) {
            if (gun >= 1 && gun <= 22) {
                System.out.print("Burcunuz:"+ba);
            }else if(gun<=30){
                System.out.print("Burcunuz:"+t);
            }else{
                System.out.print("geçersiz giriş");
            }
        } else if (ay == 10) {
            if(gun>=1 && gun<=22){
                System.out.print("Burcunuz:"+t);
            }else if(gun<=31){
                System.out.print("Burcunuz:"+ak);
            }else{
                System.out.print("geçersiz giriş");
            }
        } else if (ay ==11) {
            if(gun>=1 && gun<=21){
                System.out.print("Burcunuz:"+ak);
            }else if(gun<=30){
                System.out.print("Burcunuz:"+ya);
            }else{
                System.out.print("geçersiz giriş");
            }
        } else if (ay==12) {
            if(gun>=1 &&gun<=21){
            System.out.print("Burcunuz:"+ya);
        }else if(gun<=31){
                System.out.print("Burcunuz:"+o);
            }else{
                System.out.print("geçersiz giriş");
            }
        }else{
            System.out.print("geçersiz giriş");
        }
    }
}
