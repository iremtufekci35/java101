import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        double boy,kilo,vki;

        System.out.print("Lütfen boyunuz (metre) cinsinden giriniz: ");
        boy=input.nextDouble();

        System.out.print("Lütfen kilonuzu giriniz: ");
        kilo=input.nextDouble();

        vki= kilo / (boy*boy);
        System.out.print("Vücut kitle indeksiniz : " +vki);


    }
}