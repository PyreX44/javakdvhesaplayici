import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double tutar,kdvOran = 0.18,kdvIndirimliTutar = 0.08, kdvTutar, kdvliTutar;
        int soru;
        Scanner inp = new Scanner(System.in);
        System.out.print("Lütfen Tutarı Giriniz : ");
        tutar = inp.nextDouble();

        if (tutar<=1000) {
            kdvTutar = tutar * kdvOran;
            kdvliTutar = tutar + kdvTutar;

            System.out.print("Toplam Tutar : " + kdvliTutar);

            System.out.print("\nKDV Oranını görmek istiyor musunuz ? (1/0) : ");
            soru = inp.nextInt();

            if (soru==1){

                System.out.print("KDV tutarı : " + kdvTutar);
                System.out.print("\nKDV oranı : " + kdvOran);

            }
            else{
                System.out.print("Çıkış Yapılıyor..");
            }
        }

        else if (tutar>1000) {
            kdvTutar = tutar * kdvIndirimliTutar;
            kdvliTutar = tutar + kdvTutar;

            System.out.print("Toplam Tutar : " + kdvliTutar);

            System.out.print("\nKDV Oranını görmek istiyor musunuz ? (1/0) : ");
            soru = inp.nextInt();

            if (soru==1){

                System.out.print("KDV tutarı : " + kdvIndirimliTutar);
                System.out.print("\nKDV oranı : " + kdvOran);

            }
            else{
                System.out.print("Çıkış Yapılıyor..");
            }
        }


    }
}
