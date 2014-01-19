package DiceItUP;
import java.util.Random;

public class Dice {

    private int sides;
    private int currentSide;
    private Random rand = new Random();

        public Dice(int sides) {
        this.sides = sides;
    }

    public void roll() {
        currentSide = rand.nextInt(sides) + 1;
    }

    public int getCurrentSide() {
        return currentSide;
    }

    public int getSides() {
        return sides;
    }

    public void setSides(int sides) {
        this.sides = sides;
    }
}
