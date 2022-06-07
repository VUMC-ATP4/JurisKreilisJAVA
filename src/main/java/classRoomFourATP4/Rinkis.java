package classRoomFourATP4;



public class Rinkis {
    final double PI = 3.14;
    double radiuss;


    Rinkis(){
        System.out.println("Veidoju rinķi....");
    }

    Rinkis(double radiuss){
        System.out.println("Veidoju rinķi ar rādiusu " + radiuss);
        this.radiuss = radiuss;
    }

    public double rinkaLaukums() {
        return PI * (radiuss * radiuss);
    }

    public double diametrs() {
        return radiuss * 2;
    }


}
