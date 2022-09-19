
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int i,j,sayac=1;

        for ( i = 2; i < 100; i++) {
           sayac=1;
            for (j=2; j<i ;j++) {
                if (i%j==0) {
                    sayac=0;
                    break;
                }}
            if (sayac==1) {
                System.out.print( " " +i);
        }

        }
    }}

