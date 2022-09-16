
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

      int mat,fizik,kimya,turkce,muzik,notToplam=0;
      Scanner input=new Scanner(System.in);

      System.out.print("Matematik notunuzu girin: ");
      mat=input.nextInt();

      System.out.print("Türkçe notunuzu girin: ");
      turkce=input.nextInt();

      System.out.print("Fizik notunuzu girin: ");
      fizik=input.nextInt();

      System.out.print("Kimya notunuzu girin: ");
      kimya=input.nextInt();

      System.out.print("Müzik notunuzu girin: ");
      muzik=input.nextInt();

      double ortalama=(mat+fizik+kimya+muzik+turkce)/5;
      if(kimya>0 && kimya<=100)
      {
          kimya+=notToplam;
      }
        if(mat>0 && mat<=100)
        {
            mat+=notToplam;
        }
        if(muzik>0 && muzik<=100)
        {
            muzik+=notToplam;
        }
        if(turkce>0 && turkce<=100)
        {
            turkce+=notToplam;
        }
        if(fizik>0 && fizik<=100)
        {
            fizik+=notToplam;
        }

      if(ortalama<=55)
      {
          System.out.println("Sınıfta kaldınız.Üzgünüm.");
      }
      else {
          System.out.println("Sınıfı geçtiniz.Tebrikler.");
      }

        System.out.println("Ortalamanız: " +ortalama);
    }


    }
