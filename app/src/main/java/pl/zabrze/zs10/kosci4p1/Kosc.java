package pl.zabrze.zs10.kosci4p1;

import java.util.Random;

public class Kosc {
    private int wartosc;
    private boolean zablokowana;
    private int idObrazka;

    private int[] idObrazkow = new int[]{
            R.drawable.kosc1,
            R.drawable.kosc2,
            R.drawable.kosc3,
            R.drawable.kosc4,
            R.drawable.kosc5,
            R.drawable.kosc6,
    };

    public Kosc(int wartosc) {
        this.wartosc = wartosc;
        zablokowana = false;
        idObrazka = idObrazkow[wartosc-1];
    }

    public int getIdObrazka() {
        return idObrazka;
    }

    public Kosc(){
        zablokowana = false;
        rzucKoscia();
        idObrazka = idObrazkow[wartosc-1];
    }
    public void rzucKoscia(){
        if(!zablokowana){
            Random random = new Random();

            wartosc = random.nextInt(6)+1;
            idObrazka = idObrazkow[wartosc-1];
        }
    }
    public void zablokujKosc(){
        zablokowana = !zablokowana;
    }
    public int getWartosc() {
        return wartosc;
    }

    public void setWartosc(int wartosc) {
        this.wartosc = wartosc;
    }

    public boolean isZablokowana() {
        return zablokowana;
    }

    public void setZablokowana(boolean zablokowana) {
        this.zablokowana = zablokowana;
    }
}
