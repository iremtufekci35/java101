
import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
    int cevre,u,a,b,c;
    double alan,ua;

    Scanner input=new Scanner(System.in);

    System.out.print("1.kenarı giriniz: ");
    a=input.nextInt();

    System.out.print("2.kenarı giriniz: ");
    b=input.nextInt();

    System.out.print("3.kenarı giriniz: ");
    c=input.nextInt();

    u=(a+b+c)/2;
    cevre=2*u;
    ua= u* (u-a)*(u-b)*(u-c);
   alan =Math.sqrt (ua);
    System.out.println("Üçgenin alanı ="+alan);



    }
}