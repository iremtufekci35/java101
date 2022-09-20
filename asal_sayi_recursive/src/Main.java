import java.util.Scanner;

public class Main {


    public static void main(String[] args) {

        int number;
        Scanner input=new Scanner(System.in);
        System.out.print("Sayı giriniz: ");
        number=input.nextInt();
        if(asal (number,2)){
            System.out.println(number + " sayısı ASAL sayıdır.");
        }
        else{
            System.out.println(number + " sayısı ASAL sayı değildir");
        }
    }

    static boolean asal (int n, int m) {
        if (n <= 2) {
            return (n == 2) ? true: false;
        }
        if (m == n) {
            return true;
        }
        if (n % m == 0) {
            return false;
        }


        return asal (n, m + 1);
    }
}
