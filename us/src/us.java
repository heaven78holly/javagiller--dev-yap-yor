import java.util.Scanner;

public class us {
    public static void main(String[] args) {
        Scanner inp= new Scanner(System.in);
        System.out.print("üssü alınacak sayı:");
        int u=inp.nextInt();
        System.out.print("üs olacak sayı:");
        int n=inp.nextInt();
        int total= 1;
        for(int i=1;i<=n;i++){
            total*=u;
        }
        System.out.print("cevap:"+total);
    }
}
