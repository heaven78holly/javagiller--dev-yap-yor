import java.util.Scanner;
public class fibo {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        int a= 0,b = 1,n ,c;;
        System.out.print("sayı giriniz:");
        n = scan.nextInt();
        System.out.print(a +" "+b+" ");
        for(int i= 1;i<=n;i++){

            c=a+b;
            a=b;
            b=c;
            System.out.print(c+" ");
        }
    }
}
