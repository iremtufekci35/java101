import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int bas,total=0;
        Scanner input=new Scanner(System.in);
        System.out.print("Basamak giriniz: ");
        bas=input.nextInt();
        int a=1,b=1;
        for(int i=1;i<=bas;i++){
            total=a+b;
            a=b;
            b=total;
            System.out.println(total);


        }



    }}