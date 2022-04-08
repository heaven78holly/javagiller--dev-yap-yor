import java.util.Scanner;
public class don {
    public static void main(String[] args) {
        Scanner a =new Scanner(System.in);
        int top=0;
        int cık =0;
        System.out.print("sayı giriniz:");
            int say = a.nextInt();
        System.out.print("3 ve 4 e bölünebilen sayılar:");
        for(int i=1;i<=say;i++){
              if(i%4==0&&i%3==0) {
                  top += i;
                  cık+= i-(i-1);
                  System.out.print(i+" ");
              }

        }double bb= top/cık;
        System.out.print("\n3 ve 4 e bölünen sayıların ortalamsı:"+bb);

    }
}
