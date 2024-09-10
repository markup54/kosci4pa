package pl.zabrze.zs10.kosci4p1;

import java.util.Random;

public class Kosc {
    private int wartosc;
    private boolean zablokowana;

    public Kosc(int wartosc) {
        this.wartosc = wartosc;
        zablokowana = false;
    }
    public void rzucKoscia(){
        if(!zablokowana){
            Random random = new Random();

            wartosc = random.nextInt(6)+1;

        }
    }
    public void zablokujKosc(){
        zablokowana = true;
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
