package classroomFour;

public class Main {


    public static void main(String[] args) {


        Dog poodle = new Dog();
        poodle.name = "Polly";
        poodle.eat();
        poodle.display();



        Velosipeds velo = new Velosipeds();
        Tyres tyres = new Tyres();
        Velosipeds paramVelo = new Velosipeds(21,tyres);

        System.out.println(velo.atrumi);
        velo.atrumi = 7;
        velo.bremzesana();
        System.out.println(velo.atrumi);
        velo.riepas.isTubeless=true;
        House maja = new House();
        maja.bedrooms = 10;
        maja.houseNumber=10;
        maja.marketValue=15000.35;
        maja.bedrooms = 4;
        maja.floors = 2;
        maja.propertyType = "Mansion";

        House maja2 = new House();
        maja.bedrooms = 1;
        maja.houseNumber=10;
        maja.marketValue=15000.35;
        maja.bedrooms = 4;
        maja.floors = 2;
        maja.propertyType = "Summer House";

        House maja3 = new House();
        maja.bedrooms = 1;
        maja.houseNumber=10;
        maja.marketValue=15000.35;
        maja.bedrooms = 4;
        maja.floors = 2;
        maja.propertyType = "Cottage";

        maja.printHouse();

        Circle rinkis = new Circle(4.5);
        System.out.println(rinkis.calculateArea());
    }
}
