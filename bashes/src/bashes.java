import java.util.Scanner;
public class bashes {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.print("sayı giriniz:");
        int number= scan.nextInt();
        int tempNumber=number;
        int basValue,result=0;
        while(tempNumber!=0){
            basValue= tempNumber%10;
        result+=basValue;
        tempNumber /=10;
        }
        System.out.print(number +" basamakları toplamı:"+result);
    }
}
