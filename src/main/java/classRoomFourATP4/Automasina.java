package classRoomFourATP4;

import java.time.LocalDate;

public class Automasina {
    String marka;
    int gads;
    int nobraukums;
    int cena;

    Automasina(String marka, int gads, int nobraukums, int cena){
        this.marka = marka;
        this.gads = gads;
        this.nobraukums = nobraukums;
        this.cena = cena;
    }

    public void printetAuto() {
        System.out.println("Automašīnas marka ir " + marka + ", tās izlaides gads ir " + gads + " ,nobraukums ir "
                + nobraukums + " un cena ir " + cena + "un gadu veca " + cikGaduVeca());
    }

    public int cikGaduVeca() {
        LocalDate date = LocalDate.now();
        return (date.getYear() - gads);
    }
}