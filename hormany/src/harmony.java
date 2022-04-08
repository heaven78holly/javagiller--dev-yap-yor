import java.util.Scanner;
public class harmony {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        double result= 0;
        System.out.print("n sayısnını giriniz:");
        double n = scan.nextInt();
        for(int i=0;i<=n;i++){
            result+=(1/n);

        }
        System.out.print(result);
    }
}
//n sayısı int değerine göre 2 kat fazla yer kaplayacağından 1=1.0 daha optimist bir tercih olabiir.