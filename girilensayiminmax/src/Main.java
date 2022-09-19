
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n, number, tempNumber, tempNumber1;
        System.out.print("Kaç Tane Sayı Gireceksiniz: ");
        n = input.nextInt();
        System.out.print ("1. Sayıyı Giriniz: ");
        number = input.nextInt();
        tempNumber = number;
        tempNumber1 = number;
        for (int i = 2; i<=n; i++) {
            System.out.print( i + ". Sayıyı Giriniz: ");
            number = input.nextInt();
            if (number > tempNumber) {
                tempNumber = number;
            }
            else if(number<tempNumber1)
                tempNumber1 = number;

        }
        System.out.println("En Büyük Sayı: " + tempNumber);
        System.out.println("En Küçük Sayı: " + tempNumber1);
    }
}