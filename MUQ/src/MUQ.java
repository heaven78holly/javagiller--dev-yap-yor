import java.util.Scanner;
public class MUQ {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        int total=0,n;
        System.out.print("sayı giriniz:");
        n = scan.nextInt();
        for(int i=1;i<n;i++){
            if(n%i==0){
                total+=i;
            }
        }
        if(n==total){
            System.out.print(n +" mükemmel sayıdır");
        }else{
            System.out.print(n+" mükemmel sayı değildir");
        }
    }
}
