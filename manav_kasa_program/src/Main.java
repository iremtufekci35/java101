
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        double armutk=2.14,elmak=3.67,domatk=1.11,muzk=0.95,patk=5.0,atop,etop,dtop,mtop,ptop;
        double ak,mk,pk,ek,dk,toplam;

        System.out.print("Armut kaç kilo ? :");
        ak=input.nextDouble();

        System.out.print("Elma kaç kilo ? :");
        ek=input.nextDouble();

        System.out.print("Domates kaç kilo ? :");
        dk=input.nextDouble();

        System.out.print("Muz kaç kilo ? :");
        mk=input.nextDouble();

        System.out.print("Patlıcan kaç kilo ? :");
        pk=input.nextDouble();

        atop=ak*armutk;
        etop=ek*elmak;
        dtop=dk*domatk;
        mtop=mk*muzk;
        ptop=pk*patk;
        toplam=(atop+etop+dtop+mtop+ptop);
        System.out.print("Toplam tutar : " +toplam);


    }
}