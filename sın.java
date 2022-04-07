import java.util.Scanner;

public class sın {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int kim, mat, tur, fiz, muz;
        System.out.print("kimya notunuzu giriniz:");
        kim = inp.nextInt();
        if(kim<0) {
            System.out.print("0'dan düşük not aldığınız için üstün başarınızdan dolayı tebrikler! Fakat geçersiz giriş?\n");
        }
        else if(kim>100) {
            System.out.print("100'den yüksek not malesef bu sistemde kayıtlı değil . belki şansınızı paralel evrenlerde deneyebilirisniz.\n");
        }

        System.out.print("matematik notunuzu giriniz:");
        mat = inp.nextInt();
        if(mat<0){
            System.out.print("0'dan düşük not aldığınız için üstün başarınızdan dolayı tebrikler! Fakat geçersiz giriş\n");
        }else if(mat>100){
            System.out.print("100'den yüksek not malesef bu sistemde kayıtlı değil . belki şansınızı paralel evrenlerde deneyebilirisniz.\n");
        }
        System.out.print("türkçe notunuzu giriniz:");
        tur = inp.nextInt();
        if(tur<0){
            System.out.print("0'dan düşük not aldığınız için üstün başarınızdan dolayı tebrikler! Fakat geçersiz giriş\n");
        }else if(tur>100){
            System.out.print("100'den yüksek not malesef bu sistemde kayıtlı değil . belki şansınızı paralel evrenlerde deneyebilirisniz.\n");
        }
        System.out.print("fizik notunuzu giriniz:");
        fiz = inp.nextInt();
        if(fiz<0){
            System.out.print("0'dan düşük not aldığınız için üstün başarınızdan dolayı tebrikler! Fakat geçersiz giriş\n");
        }else if(fiz>100){
            System.out.print("100'den yüksek not malesef bu sistemde kayıtlı değil . belki şansınızı paralel evrenlerde deneyebilirisniz.\n");
        }
        System.out.print("müzik notunuzu giriniz:");
        muz = inp.nextInt();
        if(muz<0){
            System.out.print("0'dan düşük not aldığınız için üstün başarınızdan dolayı tebrikler! Fakat geçersiz giriş\n");
        }else if(muz>100){
            System.out.print("100'den yüksek not malesef bu sistemde kayıtlı değil . belki şansınızı paralel evrenlerde deneyebilirisniz.\n");
        }
        double avarage = (kim + mat + tur + fiz + muz) / 5;
        if (avarage >= 55) {
            System.out.println("tebrikler yeni sınıfın kilidi açıldı!");
        } else {
            System.out.println("kaldınız,seneye tekrar deneyin");
        }
        System.out.print("ortalamanız:"+avarage);
    }

}
