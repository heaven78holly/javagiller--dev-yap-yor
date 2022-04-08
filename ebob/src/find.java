import java.util.Scanner;
public class find {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        System.out.print("1. sayıyı giriniz:");
        int n1= scan.nextInt();
        System.out.print("2. sayıyı giriniz:");
        int n2= scan.nextInt();
        int i=n1,ebob;
        int k=1, s= n1*n2;
        while(k<=s){
            if(k%n1==0 && (k%n2)==0){
                System.out.println(n1+" ve "+n2+" sayılarının ekoku:"+k);
                break;
            }k++;
        }
        while(i>=1){
            if((n1%i)==0&& (n2%i )==0){
                ebob=i;
                System.out.print(n1 +" ve "+n2 +" sayılarının ebobu:"+ebob);
                break;

            }i--;
        }


    }
}
