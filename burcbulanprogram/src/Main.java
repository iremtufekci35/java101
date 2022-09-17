
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int month, day;
        String burc;
        Scanner input = new Scanner(System.in);

        System.out.print("Doğduğunuz ay:  ");
        month = input.nextInt();

        System.out.print("Doğduğunuz gün:  ");
        day = input.nextInt();

        if (month == 1) {
            if (day >= 1 && day <= 31) {
                if (day < 22) {
                    burc = "Oğlak";
                    System.out.print("Burcunuz :" + burc);
                } else {
                    burc = "Kova";
                    System.out.print("Burcunuz :" + burc);
                }}
            else{
                    System.out.print("Geçersiz gün girildi.");
                }}
        if  (month == 2) {
            if (day >= 1 && day <= 28) {
                if (day < 20) {
                    burc = "Kova";
                    System.out.print("Burcunuz :" + burc);
                } else {
                    burc = " Balık";
                    System.out.print("Burcunuz :" + burc);
                }
            }
           else {
            System.out.print("Geçersiz gün girildi.");
        }}

        if (month == 3) {
            if (day >= 1 && day <= 31) {
                if (day < 21) {
                    burc = "Balık";
                    System.out.print("Burcunuz :" + burc);
                } else {
                    burc = "Koç";
                    System.out.print("Burcunuz :" + burc);
                }}else {
            System.out.print("Geçersiz gün girildi.");
        }}
        if (month == 4) {
            if (day >= 1 && day <= 30) {
                if (day < 21) {
                    burc = "Koç";
                    System.out.print("Burcunuz :" + burc);
                } else {
                    burc = "Boğa";
                    System.out.print("Burcunuz :" + burc);
                }
            }
           else {
            System.out.print("Geçersiz gün girildi.");
        }}
        if (month == 5) {
            if (day >= 1 && day <= 31) {
                if (day < 22) {
                    burc = "Boğa";
                    System.out.print("Burcunuz :" + burc);
                } else {
                    burc = "İkizler";
                    System.out.print("Burcunuz :" + burc);
                }
            }
           else {
            System.out.print("Geçersiz gün girildi.");
        }}
        if (month == 6) {
            if (day >= 1 && day <= 30) {
                if (day < 23) {
                    burc = "İkizler";
                    System.out.print("Burcunuz :" + burc);
                } else {
                    burc = "Yengeç";
                    System.out.print("Burcunuz :" + burc);
                }
            }
          else {
            System.out.print("Geçersiz gün girildi.");
        }}

        if (month == 7) {
            if (day >= 1 && day <= 31) {
                if (day < 23) {
                    burc = "Yengeç";
                    System.out.print("Burcunuz :" + burc);
                } else {
                    burc = "Aslan";
                    System.out.print("Burcunuz :" + burc);
                }
            }
         else {
            System.out.print("Geçersiz gün girildi.");
        }}

        if (month == 8) {
            if (day >= 1 && day <= 31) {
                if (day < 23) {
                    burc = "Aslan";
                    System.out.print("Burcunuz :" + burc);
                } else {
                    burc = "Başak";
                    System.out.print("Burcunuz :" + burc);
                }
            }
          else {
            System.out.print("Geçersiz gün girildi.");
        }}
        if (month == 9) {
            if (day >= 1 && day <= 30) {
                if (day < 23) {
                    burc = "Başak";
                    System.out.print("Burcunuz :" + burc);
                    ;
                } else {
                    burc = "Terazi";
                    System.out.print("Burcunuz :" + burc);
                }
            }
          else {
            System.out.print("Geçersiz gün girildi.");
        }}
        if (month == 10) {
            if (day >= 1 && day <= 31) {
                if (day < 23) {
                    burc = "Terazi";
                    System.out.print("Burcunuz :" + burc);
                } else {
                    burc = "Akrep";
                    System.out.print("Burcunuz :" + burc);
                }
            }
          else {
            System.out.print("Geçersiz gün girildi.");
        }}
        if (month == 11) {
            if (day >= 1 && day <= 30) {
                if (day < 22) {
                    burc = "Akrep";
                    System.out.print("Burcunuz : " + burc);
                } else {
                    burc = "Yay";
                    System.out.print("Burcunuz :" + burc);
                }
            }
          else {
            System.out.print("Geçersiz gün girildi.");
        }}
        if (month == 12) {
            if (day >= 1 && day <= 31) {
                if (day < 22) {
                    burc = "Yay";
                    System.out.print("Burcunuz : " + burc);
                } else {
                    burc = "Oğlak";
                    System.out.print("Burcunuz : " + burc);
                }
            } else {
            System.out.print("Geçersiz gün girildi.");
        }}


    }}

