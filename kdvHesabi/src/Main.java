
import java.util.Scanner;

public class Main {
    public static void main(String[]args){
    double tutar, kdvOran1=0.18,kdvOran2=0.8,kdvTutar1,kdvliTutar1,kdvTutar2,kdvliTutar2;
    Scanner input =new Scanner(System.in);
    System.out.println("Ücret tutarını giriniz : ");
    tutar = input.nextDouble();

 if( tutar<1000 && tutar>0){

    kdvTutar1=tutar*kdvOran1;
    kdvliTutar1= kdvTutar1+tutar;

    System.out.println("KDV'siz tutar = "+tutar);
    System.out.println("KDV oranı = "+kdvOran1);
    System.out.println("KDV tutarı = "+kdvTutar1);
    System.out.println("KDV'li tutar = "+kdvliTutar1);}
 else if(tutar>1000){
     kdvTutar2=tutar*kdvOran2;
     kdvliTutar2= kdvTutar2+tutar;

     System.out.println("KDV'siz tutar = "+tutar);
     System.out.println("KDV oranı = "+kdvOran2);
     System.out.println("KDV tutarı = "+kdvTutar2);
     System.out.println("KDV'li tutar = "+kdvliTutar2);
 }
}}