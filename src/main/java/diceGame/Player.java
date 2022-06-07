package diceGame;

public class Player {
    String name;
    Dice[] dices;

    public Player(String name) {
        this.name = name;
    }

    public int getDiceSum(){
        int sum = 0;
        for (int i = 0; i < dices.length; i++) {
            sum = sum + dices[i].faceValue;
        }
        return sum;
    }
}
