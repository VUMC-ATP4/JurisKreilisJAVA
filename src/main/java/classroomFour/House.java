package classroomFour;

public class House {
    int houseNumber;
    String propertyType;
    byte floors;
    int bedrooms;
    double marketValue;

    House() {
        System.out.println("Veidojam jaunu māju...");
        marketValue = 100000;
    }

    class Test {
        Test() {
            // constructor body
        }
    }


    public House(int houseNumber, String propertyType, byte floors, int bedrooms, double marketValue) {
        this.houseNumber = houseNumber;
        this.propertyType = propertyType;
        this.floors = floors;
        this.bedrooms = bedrooms;
        this.marketValue = marketValue;
    }

    public void printHouse() {
        System.out.println("Mājas numurs " + houseNumber);
        System.out.println("Tips " + propertyType);
        System.out.println("Stāvi " + floors);
        System.out.println("Guļamistabas " + bedrooms);
        System.out.println("Cena " + marketValue);
    }
}
