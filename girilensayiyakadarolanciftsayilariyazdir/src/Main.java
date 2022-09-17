import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int sayi,toplam=0,sayac=0,ort;

        Scanner input=new Scanner(System.in);
        System.out.print("Sayı giriniz: ");
        sayi=input.nextInt();

        for(int i =0; i<=sayi ; i++){
            if(i%3==0 &&i%4==0){
                System.out.println(i);
                toplam=toplam+i;
                sayac=sayac+1;
            }
        }
       ort=toplam/sayac;
        System.out.println("0 dan " +sayi +" e kadar olan 3 ve 4 e bölünen sayıların ortalaması:" +ort);
    }
}