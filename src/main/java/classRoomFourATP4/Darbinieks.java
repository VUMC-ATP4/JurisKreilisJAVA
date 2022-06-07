package classRoomFourATP4;

public class Darbinieks {
    String vards;
    String uzvards;
    String amats;
    String nodala;
    int stavs;
    int talrunis;
    int vecums;

    public void darbinieksAtrodas() {
        System.out.println(amats + " no " + nodala + " sēž " + stavs + ". stāvā");
    }

    public void darbiniekaID() {
        System.out.println("Vārds: " + vards + " uzvārds: " + uzvards + ". Darbiniekam ir " + vecums + " gadi");
        System.out.println("Strādā par " + amats + " " + nodala + " nodaļā");
        System.out.println("Tālrunis: " + talrunis);

    }
}
