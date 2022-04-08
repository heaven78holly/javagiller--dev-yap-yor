import java.util.Scanner;

public class tek {
    public static void main(String[] args) {
        Scanner a=new Scanner(System.in);
        int top=0;
        boolean ısİt= true;
        while(ısİt){
            System.out.print("sayı giriniz:");
            int b=a.nextInt();
            if (b%2 ==0){
                if (b%4==0){
                   top+=b;
                }
            }else{
                ısİt= false;
                System.out.println("program sonlandı");
            }


        }
        System.out.print("4 e bölünen sayıların toplamı:"+top);
    }

}
