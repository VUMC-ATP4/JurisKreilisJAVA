package classroomFour;

public class Velosipeds {
    int atrumi = 21;
    Tyres riepas = new Tyres();

    public Velosipeds(){
    }

    public Velosipeds(int atrumi, Tyres riepas) {
        this.atrumi = atrumi;
        this.riepas = riepas;
    }

    public void bremzesana() {
        System.out.println("Velosipēds bremzē");
    }

    public void brauksana(){
        System.out.println("Velosipeds brauc");
    }
}
