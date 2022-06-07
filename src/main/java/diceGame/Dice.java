package diceGame;

class Dice {
    int faceValue;
    final int MAX = 6;

    Dice() {
        faceValue = 1;
    }

    Dice(int value) {
        faceValue = value;
    }

    public int roll() {
        faceValue = (int) (Math.random() * MAX) + 1;
        return faceValue;
    }

    public void getFaceValue(){
        System.out.println("Kauliņa vērtība ir: " + faceValue);
    }

}
