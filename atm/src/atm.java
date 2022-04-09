import java.util.Scanner;
public class atm {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        String userName,password,userName2,password2;
        int right=3,select,balance=0,casual;
        System.out.println("merhaba, kayıt işlemi için bilgilerinizi giriniz!");
        System.out.print("kullanıcı adınızı giriniz:");
        userName2=scan.nextLine();
        System.out.print("Şifrenizi giriniz:");
        password2=scan.nextLine();
        System.out.println("giriş işlemi için bilgilerinizi giriniz");

        while (right>0){
        System.out.print("kullanıcı adınızı giriniz:");
        userName=scan.nextLine();
        System.out.print("Şifrenizi giriniz:");
        password=scan.nextLine();

        if(userName.equals(userName2)&& password.equals(password2)){
            System.out.println("X bankasına hoşgeldiniz.");
            do{

                System.out.print("1-para yatırma\n2-para çekme \n3-bakiye sorma\n4-cıkış\n");
                System.out.print("lütfen yapmak istediğiniz işlemi seçiniz:");
                select =scan.nextInt();
                switch (select){
                    case 1:
                        System.out.print("para miktarı:");
                        casual=scan.nextInt();
                        balance +=casual;
                        System.out.println("işlem başarıyla gerçekleştirildi");
                        break;
                    case 2:

                        System.out.print("para miktarı:");
                        casual=scan.nextInt();
                        if(casual>balance){
                            System.out.println("yetersiz bakiye!");
                        }else{
                        balance -=casual;
                        System.out.print("işlem başarıyla gerçekleştirildi");
                        }break;
                    case 3:
                        System.out.print("güncel bakiyeniz:"+balance);
                        break;

                    case 4:
                        System.out.print("başarıyla çıkış yapıldı");
                        break;
                    default:
                        System.out.print("hatalı giriş yaptınız!");

                }

            }while(select!=4);
            break;

        }else {
            right--;
                    System.out.println("hatalı giriş yaptınız tekrar deneyiniz." );
            if(right==0){
                System.out.println("hesabınız bloke olmuştur,bankayla iletişime geçiniz.");
            }else {
                System.out.println("kalan hakkınız:"+right);
            }

        }
}

}
}
