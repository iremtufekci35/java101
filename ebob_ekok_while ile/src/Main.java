import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);
        System.out.print("n1 sayısını giriniz: ");
        int n1= input.nextInt();
        System.out.print("n2 sayısını giriniz: ");
        int n2=input.nextInt();
        int ebob,i=1,k,j=1;
        i=1;
        //EBOB N1 BÜYÜK İKEN
        if(n1>n2){
        while(i<=n1){
            i++;
              if(n1%i==0 && n2%i==0) {
                ebob=i;
            }
        }
        System.out.println("-----------");
        k=n1;
        while(k>=1)
        {  k--;
            if(n1%k==0 && n2%k==0)
            {
                ebob=k;
                System.out.println("Sayıların EKOK'u : "+ebob);
                break;
            }

        }
        //EKOK N1 BÜYÜK İKEN
        j=1;
        while (j<=(n1*n2)){
            j++;
            if(j%n1==0 && j%n2==0)
            {
                System.out.println("Sayıların EKOK'u : " +j);
                break;
            }
        }
  //EBOB n2 büyükken

    } int a=1;
        if(n2>n1){
            while(a<=n2){
                a++;
                if(n1%a==0 && n2%i==a) {
                    ebob=a;
                }
            }
            System.out.println("-----------");
            int b=n2;
            while(b>=1)
            {  b--;
                if(n1%b==0 && n2%b==0)
                {
                    ebob=b;
                    System.out.println("Sayıların EKOK'u : "+ebob);
                    break;
                }

            }
            //EKOK N2 BÜYÜK İKEN
           int c=1;
            while (c<=(n1*n2)){
                c++;
                if(j%n1==0 && j%n2==0)
                {
                    System.out.println("Sayıların EKOK'u : " +c);
                    break;
                }
            }

        }
    }

}