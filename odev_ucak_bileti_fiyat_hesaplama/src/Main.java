
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double mesafe, tutar, indTutar, indTutargd, yasİnd, total;
        int yas, tekcift;
        System.out.print("Mesafeyi km cinsinden giriniz : ");
        mesafe = input.nextDouble();

        System.out.print("Yaşınızı giriniz : ");
        yas = input.nextInt();

        System.out.print("Yolculuk tipini giriniz  1-Tek yön  2-Gidiş Dönüş  ");
        tekcift = input.nextInt();
        tutar = mesafe * 0.10;
        yasİnd = tutar * 0.10;
        indTutar = tutar - yasİnd;
        indTutargd = indTutar * 0.20;
        total = (indTutar - indTutargd) * 2;


                if (tekcift==1 &&yas > 0 && mesafe > 0 ) {
                    if (yas < 12) {
                        tutar = mesafe * 0.10;
                        yasİnd = tutar * 0.50;
                        indTutar = tutar - yasİnd;
                        System.out.print("Toplam tutar= " + indTutar);
                    } else if (yas >= 12 && yas < 25) {
                        tutar = mesafe * 0.10;
                        yasİnd = tutar * 0.10;
                        indTutar = tutar - yasİnd;
                        System.out.print("Toplam tutar= " + indTutar);
                    } else if (yas >= 65) {
                        tutar = mesafe * 0.10;
                        yasİnd = tutar * 0.30;
                        indTutar = tutar - yasİnd;
                        System.out.print("Toplam tutar= " + indTutar);
                    } else if (yas > 25 && yas < 65) {
                        tutar = mesafe * 0.10;
                        System.out.print("Toplam tutar= " + tutar);
                    }

                else    {System.out.print("HATALI GİRİŞ YAPTINIZ!!!");}}


                if (tekcift==2 &&yas > 0 && mesafe > 0 ) {
                    if (yas < 12) {
                        tutar = mesafe * 0.10;
                        yasİnd = tutar * 0.50;
                        indTutar = tutar - yasİnd;
                        indTutargd = indTutar * 0.20;
                        total = (indTutar - indTutargd) * 2;
                        System.out.print("Toplam tutar= " + total);
                    } else if (yas >= 12 && yas < 25) {
                        tutar = mesafe * 0.10;
                        yasİnd = tutar * 0.10;
                        indTutar = tutar - yasİnd;
                        indTutargd = indTutar * 0.20;
                        total = (indTutar - indTutargd) * 2;
                        System.out.print("Toplam tutar= " + total);
                    } else if (yas >= 65) {
                        tutar = mesafe * 0.10;
                        yasİnd = tutar * 0.30;
                        indTutar = tutar - yasİnd;
                        indTutargd = indTutar * 0.20;
                        total = (indTutar - indTutargd) * 2;
                        System.out.print("Toplam tutar= " + total);
                    } else if (yas > 25 && yas < 65) {
                        tutar = mesafe * 0.10;
                        total = (indTutar - indTutargd) * 2;
                        System.out.print("Toplam tutar= " + total);
                    }

                }
                else   {System.out.print("HATALI GİRİŞ YAPTINIZ!!!");}
    }}