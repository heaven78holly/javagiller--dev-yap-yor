import java.util.Scanner;

public class termo {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("hava sıcaklığını giriniz:");
        int der = inp.nextInt();
        if (der < 5) {
            System.out.print("kayak yapabilirsiniz.");
        } else if (der < 26) {
            if (der < 15) {
                System.out.print("sinemaya gidebilirsiniz.");

            }else {
                System.out.print("pikniğe gidebilirsiniz");
            }

        }/* else elif(der>80){
            System.out.print("yanabilirisniz")
        }*/
        else{
            System.out.print("yüzmeye gidebilirsiniz");
        }
    }


}
/*Koşullar :

Sıcaklık 5'dan küçük ise "Kayak" yapmayı öner.
Sıcaklık 5 ve 15 arasında ise "Sinema" etkinliğini öner.
Sıcaklık 15 ve 25 arasında ise "Piknik" etkinliğini öner.
Sıcaklık 25'ten büyük ise "Yüzme" etkinliğini öner.*/