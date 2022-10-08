
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Matris satırı: ");
        int row = input.nextInt();
        System.out.print("Matris sütunu: ");
        int column = input.nextInt();
        System.out.println("Matrisi girin:");

        int [] [] matris = new int [row] [column];

        for (int i =0 ; i < matris.length; i++) {
            for(int j = 0 ; j < matris[i].length;j++)
                matris[i][j] = input.nextInt();
        }
        System.out.println("Matris : ");
        System.out.println();

        for(int i =0  ; i < matris.length;i++){
            for(int j = 0 ; j < matris[i].length;j++)
                System.out.print(matris[i][j]+"   ");
            System.out.println();
        }
        System.out.println("Matrisin transpozesi : ");
        System.out.println();

        for(int j = 0 ; j < matris[0].length;j++){
            for(int i =0  ; i < matris.length;i++){
                System.out.print(matris[i][j]+"   ");
            }
            System.out.println();
        }
    }
}