package classRoomFourATP4;

public class Kompanija {
    String nosaukums;
    int darbiniekuSkaits;
    String komersantaTips;
    int gadaIenakumi;
    boolean vaiMaksatSpejigs;
    Darbinieks[] darbiniekuSaraksts;

    public void kompInfo (){
        System.out.println(nosaukums+ " "
                + darbiniekuSkaits + " "
                + komersantaTips + " "
                + gadaIenakumi +
                "Vai maksātspējīgs " + vaiMaksatSpejigs );
    }

}
