package classRoomFourATP4;

public class House {

    String ielasNosaukums;
    int majasNumurs;
    int stavuSkaits;
    int ieejuSkaits;
    int istabuSkaits;
    double platiba;
    Cena cena;
    boolean irStavvieta;
    int skatijumuSkaits;

    public double cenaKvadratmetra(){
       return cena.cena/platiba;
    }

    public void printetAdresi(){
        System.out.println("Mājas adrese ir: " + ielasNosaukums + " " + majasNumurs);
    }

    public void printetVisu() {
        printetAdresi();
        System.out.println("Māja: " +
                "stavuSkaits=" + stavuSkaits +
                ", ieejuSkaits=" + ieejuSkaits +
                ", istabuSkaits=" + istabuSkaits +
                ", platiba=" + platiba + "m^2" +
                ", cena=" + cena +
                ", irStavvieta=" + irStavvieta +
                ", cena kvadrātmetrā ir " + cena.cena/platiba +
                '}');
    }
}
