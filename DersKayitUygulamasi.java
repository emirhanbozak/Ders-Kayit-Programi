
import java.util.Scanner;

public class DersKayitUygulamasi {
    public static void main(String[] args) {
        Scanner giris = new Scanner(System.in);
        Ogrenci ogrenci = new Ogrenci("Emirhan Bozak");

        Ders d1 = new Ders("Matematik", 4, 2);
        Ders d2 = new Ders("Programlama", 5, 1);
        Ders d3 = new Ders("İstatistik", 3, 3);

        int secim;
        do {
            System.out.println("\n=== DERS KAYIT SİSTEMİ ===");
            System.out.println("1- Ders Ekle");
            System.out.println("2- Dersleri Listele");
            System.out.println("3- Çıkış");
            System.out.print("Seçiminiz: ");
            secim = giris.nextInt();

            switch (secim) {
                case 1:
                    System.out.println("1- Matematik  2- Programlama  3- İstatistik");
                    System.out.print("Seçiminiz: ");
                    int dersSecim = giris.nextInt();
                    if (dersSecim == 1) ogrenci.dersEkle(d1);
                    else if (dersSecim == 2) ogrenci.dersEkle(d2);
                    else if (dersSecim == 3) ogrenci.dersEkle(d3);
                    else System.out.println("Geçersiz seçim!");
                    break;
                case 2:
                    ogrenci.dersleriListele();
                    break;
                case 3:
                    System.out.println("Sistemden çıkılıyor...");
                    break;
                default:
                    System.out.println("Geçersiz seçim!");
            }
        } while (secim != 3);
    }
}
