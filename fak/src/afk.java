import java.util.Scanner;
public class afk {
    public static void main(String[] args) {
        Scanner a=new Scanner(System.in);
        System.out.print("kümedeki eleman sayısı:");
            int sa=a.nextInt();
            System.out.print("birim alt gruptaki eleman sayısı:");
                int s= a.nextInt();
                int tot=1;
                int total=1;
                int b=sa-s;
                int tut=1;
                for(int i=1;i<=sa;i++){
                    tot*=i;
                    //n!
                }
                for(int i=1;i<=s;i++){
                    total*=i;
                    //r!
                }
                for(int i=1;i<=b;i++){
                    tut*=i;

                }
                int comb=tot/(total*(tut));
                System.out.print(sa+" sayısının "+s+" sayılı kombinasyonu:"+comb);
    }
}
