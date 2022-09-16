
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String userName, password, newPassword,select;


        Scanner input = new Scanner(System.in);

        System.out.print("Kullanıcı adınız : ");
        userName = input.nextLine();

        System.out.print("Şifreniz: ");
        password = input.nextLine();

        if (userName.equals("patika") && password.equals("java123")) {
            System.out.println("Giriş yaptınız! ");
        }
        else {
            System.out.println("Bilgileriniz yanlış!");
            System.out.println("Şifrenizi sıfırlamak istiyor musunuz 'E' 'H' ?");
            select = input.nextLine();
            if(select.equals("E")) {
                System.out.println("Yeni şifreyi girin: ");
                newPassword=input.nextLine();
                System.out.println("Yeni şifreniz " +newPassword);
                if(newPassword.equals( password))
                {
                    System.out.println("Yeni şifre eskisi ile aynı!!!");
                }

            }
            else {
                System.out.println("Şifre değiştirilmedi");
            }
            }

        }
    }


