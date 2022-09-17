import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int total;
        Scanner scan= new Scanner(System.in);
        System.out.println("Hesaplamak istediğiniz kombinasyon sayılarını sırasıyla giriniz.");

        int n = scan.nextInt();

        int fkt = n;
        for(int i = n-1; i>=1;i--){
            n *=i;
        }

        int r = scan.nextInt();
        fkt-= r;

        for(int i = r-1; i>=1;i--){
            r *=i;
        }

        for(int i = fkt-1; i>=1;i--){
            fkt*=i;
        }
        total = n/(r*fkt);
        System.out.println(total);


    }
}