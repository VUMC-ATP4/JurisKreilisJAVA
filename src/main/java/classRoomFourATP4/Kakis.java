package classRoomFourATP4;

public class Kakis {


    public Kakis(String dzimums, int vecums, String spalvasGarums, boolean aste, boolean skirnesKakis, boolean irSterilizets) {
        this.dzimums = dzimums;
        this.vecums = vecums;
        this.spalvasGarums = spalvasGarums;
        this.aste = aste;
        this.skirnesKakis = skirnesKakis;
        this.irSterilizets = irSterilizets;
    }

    String dzimums = "Vīr";
    int vecums = 5;
    String spalvasGarums = "Īsa";
    boolean aste = true;
    boolean skirnesKakis = false;
    boolean irSterilizets = false;


    public void printetKakis(){
        System.out.println("Kaķa dzimums ir: " + dzimums);
        System.out.println("Kaķa vecums ir: " + vecums);
        System.out.println("Spalvas garums ir: " + spalvasGarums);
        System.out.println("Aste ir/nav : " + aste);
        System.out.println("Šķirnes kaķis : " + skirnesKakis);
        System.out.println("Vai ir sterliziterts" + irSterilizets);
    }
}
