import java.util.Scanner;
public class ucak {
    public static void main(String[] args) {
        Scanner inp=new Scanner(System.in);
        System.out.print("gideceğiniz mesafeyi km cinsinden giriniz:");
            double km= inp.nextDouble();
        System.out.print("yaşınızı giriniz:");
            int yas= inp.nextInt();
        System.out.print("yolculuk tipini seçiniz: =>1 tek yön =>2 gidiş dönüş\n");
            int sec= inp.nextInt();
            double tut=0.1;
            double tutar= km*tut;
            if(km>=0){
            if(yas>=0&&yas<12){
                double tut2= tutar*0.5;
                switch (sec){
                    case 1:
                        System.out.print("toplam tutar:"+tutar+"\nindirimli tutar:"+(tutar-tut2)); // tutar/2
                        break;
                    case 2:
                        double tut4= tut2*0.2;
                        System.out.print("toplam tutar:"+tutar+"\nindirimli tutar:"+(tutar-tut2-tut4));
                        break;
                    default:
                        System.out.print("Hatalı veri girdiniz");

                }
            }else if(yas>=12 && yas<=24){
                double tut3=km*0.1;
                switch (sec){
                    case 1:
                        System.out.print("toplam tutar:"+tutar+"\nindirimli tutar:"+(tutar-tut3));
                        break;
                    case 2:
                        double tut4= (tutar-tut3)*0.2;
                        System.out.print("toplam tutar:"+tutar+"\nindirimli tutar:"+(tutar-tut3-tut4));
                        break;
                    default:
                        System.out.print("Hatalı veri girdiniz");

                }

            }else if(yas>65){
                double tut5=km*0.3;
                switch (sec){
                    case 1:
                        System.out.print("toplam tutar:"+tutar+"\nindirimli tutar:"+(tutar-tut5));
                        break;
                    case 2:
                        double tut4= (tutar-tut5)*0.2;
                        System.out.print("toplam tutar:"+tutar+"\nindirimli tutar:"+(tutar-tut5-tut4));
                        break;
                    default:
                        System.out.print("Hatalı veri girdiniz");

                }
            }else if(yas<=65){
                switch (sec){
                    case 1:
                        System.out.print("toplam tutar:"+tutar);
                        break;
                    case 2:
                        double tut4= tutar*0.2;
                        System.out.print("toplam tutar:"+tutar+"\nindirimli tutar:"+(tutar-tut4));
                        break;
                    default:
                        System.out.print("Hatalı veri girdiniz");

                }
            }
            else{
                System.out.print("Hatalı Veri Girdiniz!");
            }}else{
                System.out.print("Hatalı Veri Girdiniz!");
            }

    }
}

