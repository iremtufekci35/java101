import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int ss;
        Scanner input=new Scanner(System.in);
        System.out.print("Sınır sayısını girin: ");
        ss= input.nextInt();

        for(int i=1; i<=200 ;i*=4 )
        {
            System.out.print("4' ün kuvveti olan sayılar :");
            System.out.println(i);
        }
        for(int j=1; j<=200; j*=5)
        {
            System.out.print("5'in kuvveti olan sayılar :");
            System.out.println(j);
        }
    }
}