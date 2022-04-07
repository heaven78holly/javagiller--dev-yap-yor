import java.util.Scanner;

public class hes {
    public static void main(String[] args) {
        int n1,n2,select;
        Scanner inp= new Scanner(System.in);
        System.out.print("1. sayıyı giriniz:");
                n1= inp.nextInt();
        System.out.print("2. sayıyı giriniz:");
            n2= inp.nextInt();

            System.out.print("yapmak istediğiniz işlemi seçin:\n1-toplama 2- çıkarma 3-çarpma 4-bölme");
            select= inp.nextInt();
            switch(select){
                case 1:
                    System.out.print(n1+n2);
                    break;
                case 2:
                    System.out.print(n1-n2);
                    break;
                case 3:
                    System.out.print(n1*n2);
                    break;
                case 4:
                    if(n1==0 || n2==0) {
                        System.out.print("bir sayı 0'a bölünemez!");
                }
                    else{
                        System.out.print(n1 / n2);
                    }
                    break;
                default:
                    System.out.print("seçiminizi sayı cinsinden giriniz!(1-4)");

            }


    }
}
