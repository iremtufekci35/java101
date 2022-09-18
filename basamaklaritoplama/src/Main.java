import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        int sayi, basTop = 0,a;
        System.out.print("Basamakları toplanacak sayıyı giriniz:  ");
        sayi = input.nextInt();

        while(sayi != 0) {
            a = sayi % 10;
            basTop+= a;
            sayi/= 10;
        }
        System.out.println("Basamaklar toplamı : " + basTop);
    }
}


