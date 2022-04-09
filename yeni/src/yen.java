import java.util.Scanner;

public class yen {


    public static void main(String[] args) {
        int bigNumber=0, lastNumber=0,n,numb;
        Scanner scan= new Scanner(System.in);
        System.out.print("kaç tane sayı gireceksiniz ?:");
        n= scan.nextInt();

        for(int i=n;i>0;i--) {
            System.out.print("sayı giriniz:");
            numb = scan.nextInt();

            if (numb > bigNumber) {                        //HATALI
                bigNumber = numb;
            }
/*
            else{
                if(numb>lastNumber){
                }
                else{
                   lastNumber = numb;}
            }*/ //ardışık olarak artan sayılar giriğinde yanlış çıktı
            if (numb < lastNumber){
                lastNumber=numb;
            //0 dan küçük sayı girilmezse küçük sayı 0 kabol ediliyor   x!
            }
// küçük ve büyük sayıyı ilk sayı bazında kabul etmeli ona göre karşılaştırma işlemini yapmalı

        }
        System.out.println("girdiğiniz en büyük sayı:"+bigNumber);
        System.out.println("girdiğiniz en küçük sayı:"+lastNumber);
    }}
