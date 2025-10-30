
public class Ders {
    private String ad;
    private int kredi;
    private int kontenjan;
    private int kayitliOgrenci;

    public Ders(String ad, int kredi, int kontenjan) {
        this.ad = ad;
        this.kredi = kredi;
        this.kontenjan = kontenjan;
        this.kayitliOgrenci = 0;
    }

    public boolean derseKayitYap() {
        if (kayitliOgrenci < kontenjan) {
            kayitliOgrenci++;
            return true;
        } else {
            return false;
        }
    }

    public String getAd() {
        return ad;
    }

    public int getKredi() {
        return kredi;
    }

    public int kalanKontenjan() {
        return kontenjan - kayitliOgrenci;
    }
}
