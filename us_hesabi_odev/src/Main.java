import java.util.Scanner;

public class Main {

    static int power(int b,int a)
    {
        if (a == 0)
                return  1;
        else if(b==1)
               return 1;
		else
            return b * power (b,a-1);
        }


    public static void main(String[] args) {


        Scanner input=new Scanner(System.in);
        System.out.print("Üssü alınacak sayı : ");
        int a=input.nextInt();
        System.out.print("Üs olacak sayı : ");
        int b=input.nextInt();
        System.out.print("Sonuç: "+power(a,b));

    }
}