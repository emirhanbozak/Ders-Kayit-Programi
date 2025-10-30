
import java.util.ArrayList;

public class Ogrenci {
    private String ad;
    private ArrayList<Ders> dersler;

    public Ogrenci(String ad) {
        this.ad = ad;
        this.dersler = new ArrayList<>();
    }

    public void dersEkle(Ders d) {
        if (d.derseKayitYap()) {
            dersler.add(d);
            System.out.println(d.getAd() + " dersi eklendi.");
        } else {
            System.out.println(d.getAd() + " dersi dolu!");
        }
    }

    public void dersleriListele() {
        System.out.println(ad + " adlı öğrencinin kayıtlı dersleri:");
        int toplamKredi = 0;
        for (Ders d : dersler) {
            System.out.println("- " + d.getAd() + " (" + d.getKredi() + " kredi)");
            toplamKredi += d.getKredi();
        }
        System.out.println("Toplam kredi: " + toplamKredi);
    }
}