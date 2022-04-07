import java.util.Scanner;

public class zod {
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        System.out.print("doğum yılınızı giriniz:");
            int yıl =in.nextInt();
            if(yıl<=0){
                System.out.print("geçersiz veri girişi");
            }else{
            int zodd= yıl%12;
            switch(zodd){
                case 0:
                    System.out.print("çin zodyağı burcunuz: maymun");
                    break;
                case 1:
                    System.out.print("çin zodyağı burcunuz: horoz");
                    break;
                case 2:
                    System.out.print("çin zodyağı burcunuz: köpek");
                    break;
                case 3:
                    System.out.print("çin zodyağı burcunuz: domuz");
                    break;
                case 4:
                    System.out.print("çin zodyağı burcunuz: fare");
                    break;
                case 5:
                    System.out.print("çin zodyağı burcunuz: öküz");
                    break;
                case 6:
                    System.out.print("çin zodyağı burcunuz: kaplan");
                    break;
                case 7:
                    System.out.print("çin zodyağı burcunuz: tavşan ");
                    break;
                case 8:
                    System.out.print("çin zodyağı burcunuz: ejderha");
                    break;
                case 9:
                    System.out.print("çin zodyağı burcunuz: yılan");
                    break;
                case 10:
                    System.out.print("çin zodyağı burcunuz: at");
                    break;
                case 11:
                    System.out.print("çin zodyağı burcunuz: koyun");
                    break;
            }}
    }
}
