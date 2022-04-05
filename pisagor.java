import java.util.Scanner;


public class pisagor {
    public static void main(String[] args) {
        System.out.println("üçgenin ilk kenarını giriniz:");
        Scanner a = new Scanner(System.in);
        int bir = a.nextInt();
        System.out.println("üçgenin ikinci kenarını giriniz:");
        int iki= a.nextInt();
        System.out.println("üçgenin üçüncü kenarını giriniz:");
        int uc = a.nextInt();
        int  u = (bir+iki+uc) / 2;
        int cevre = 2*u;
        long alan =u*(u-bir)*(u-iki)*(u- uc);
        System.out.println("üçgenin çevresi:"+ cevre);
        System.out.println("üçgenin alanı:"+ (Math.sqrt(alan)));




    }
}
