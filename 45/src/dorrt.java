import java.util.Scanner;
public class dorrt {
    public static void main(String[] args) {
        Scanner a=new Scanner(System.in);
        System.out.print("sınır sayıyı seçin:");
            int b =a.nextInt();
            System.out.print("4 ün kuvvetleri:");
            for(int i=1;i<=b;i*=4){
                System.out.print(i +" ");
            }
            System.out.print("\n5 in kuvvetleri:");
            for (int s=1;s<=b;s*=5){
                System.out.print(s+" ");
            }
    }
}
