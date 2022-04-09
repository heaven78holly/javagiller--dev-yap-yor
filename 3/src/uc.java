import java.util.Scanner;
public class uc {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("n sayısını giriniz:");
        int n= scan.nextInt();
        for(int a=n;a>=0;a--){
        for(int i= 0;i<=n-a+1;i++){
            System.out.print(" ");
        }
            for(int j=1 ;j<=(2*a-1);j++){
                System.out.print("*");
            }
            System.out.println();
        }
        }
    }

