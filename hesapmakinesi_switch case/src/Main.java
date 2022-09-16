import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int n1,n2,select;

        Scanner input=new Scanner(System.in);
        System.out.print("1.Sayıyı giriniz : ");
        n1=input.nextInt();
        System.out.print("2.Sayıyı giriniz : ");
        n2=input.nextInt();

        System.out.println("1-Toplama\n 2-Çıkarma\n 3-Çarpma\n 4-Bölme");
        System.out.println("Seçiminiz :");
        select=input.nextInt();
        switch(select){
            case 1:
                System.out.println("Toplam :" +(n1+n2));
                break;
            case 2:
                System.out.println("Fark :" +(n1-n2));
                break;
            case 3:
                System.out.println("Çarpım :" +(n1*n2));
                break;
            case 4:
                if( n2!=0) {
                System.out.println("Bölüm :" +(n1/n2));}
                else {
                    System.out.println("Sayıyı 0 'a bölemezsiniz.");
                }
                break;
            default: System.out.println("Hatalı işlem yaptınız. Tekrar deneyin.");

        }
    }
}
