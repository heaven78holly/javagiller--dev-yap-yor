import java.util.Scanner;

public class vke {
    public static void main(String[] args) {
        Scanner vk= new  Scanner(System.in);
        System.out.print("Lütfen boyunuzu (metre cinsinde) giriniz:");
        double boy = vk.nextDouble();
        System.out.print("Lütfen kilonuzu giriniz:");
        double kilo=vk.nextDouble();
        double son = kilo/(boy*boy);
        System.out.print("vücut kitle endeksiniz:"+son);

                /* detaylı hesaplama yapmak isteyenler kilosunu virgüllü girebilir?*/

    }
}
