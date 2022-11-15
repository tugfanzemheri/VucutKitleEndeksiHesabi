import java.util.Scanner;
public class VucutKitleEndeksiHesabi {
    public static void main(String[] args) {
        float boy, kilo;
        double indeks;
        Scanner gboy = new Scanner(System.in);
        System.out.print("Lütfen boyunuzu (metre cinsinde) giriniz: ");
        boy = gboy.nextFloat();
        Scanner gkilo = new Scanner(System.in);
        System.out.print("Lütfen kilonuzu giriniz                 : ");
        kilo = gboy.nextFloat();
        indeks = kilo / (boy * boy);
        System.out.println("Vücüt kitle indeksiniz                  : " + indeks );

    }
}
