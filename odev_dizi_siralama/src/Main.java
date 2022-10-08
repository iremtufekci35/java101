import java.util.Scanner;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {


        int size, temp = 0;
        Scanner input= new Scanner(System.in);
        System.out.print("Dizinin boyutunu giriniz:");
        size = input.nextInt();

        if(size>0)
        {
            int []dizi = new int [size];
            for (int i = 0; i < size; i++)
            {
                System.out.printf (i+1 +". elemani giriniz:");
                dizi [i] =input.nextInt();
            }

            System.out.println ("Oluşturulan dizi: " +Arrays.toString(dizi));

            for(int i=0;i<size;i++)
            {
                for (int j = i + 1; j<size; j++)
                {
                    if(dizi[i] > dizi[j])
                    {
                        temp = dizi[i];
                        dizi [i] = dizi [j];
                        dizi [j] = temp;
                    }
                }
            }

            System.out.println ("Küçükten büyüğe dizi: " +Arrays.toString(dizi));
        }

        else
        {
            System.out.print("Hatalı girdiniz!!!");
            System.exit(0);
        }

    }
}