
import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        int heat;
        Scanner input=new Scanner(System.in);
        System.out.print("Hava sıcaklığını giriniz: ");
        heat=input.nextInt();

        if (heat<5)
        {
            System.out.println("Kayağa gidebilirsin.");
        } else if (heat<=25) {
            if (heat<=15)
            {
                System.out.println("Sinemaya gidebilirsin.");
            }
            if (heat>=10){
                System.out.println("Pikniğe gidebilirsin.");
            }
        else{
            System.out.println("Yüzmeye gidebilirsin.");
            }
        }
    }
}