import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int mat,fizik,kimya,turkce,tarih,muzik;
        Scanner inp= new Scanner(System.in);
        System.out.print("Matematik notunuzu girin :");
        mat=inp.nextInt();

        System.out.print("Fizik notunuzu girin :");
        fizik=inp.nextInt();

        System.out.print("Kimya notunuzu girin :");
        kimya=inp.nextInt();

        System.out.print("Türkce notunuzu girin :");
        turkce=inp.nextInt();

        System.out.print("Tarih notunuzu girin :");
        tarih=inp.nextInt();

        System.out.print("Müzik notunuzu girin :");
        muzik=inp.nextInt();

        int toplam =( mat+fizik+kimya+turkce+tarih+muzik);
        double sonuc = toplam / 6.0;
        System.out.println("Ortalamanız =" +sonuc);

        boolean kosul1= sonuc>=60;
        boolean kosul2=sonuc<60;
        String str= kosul1? "GEÇTİNİZ."  : "KALDINIZ.";
        System.out.println(str);


    }
    }
