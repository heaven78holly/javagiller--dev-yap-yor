import java.util.Scanner;
public class star {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.print("n sayısı girin:");
        int number= scan.nextInt();
        int n =number;
        int i=0;
        while(i<=n){
            for(int k=0;k<=(n-i);k++){
                System.out.print(" ");
            }
            for(int j=1;j<=((2*i)-1);j++){
            System.out.print("*");
            }
            System.out.println(" ");
            i++;
        }int f =1;
        for(int c=1;c<=(number);c++){
            for(int b=0;b<=f;b++){
                System.out.print(" ");
            }
            for(int a=1;a<=2*number-(2*f)-1;a++) {
                System.out.print("*");
            }System.out.println();
            f++;
        }
    }
}
