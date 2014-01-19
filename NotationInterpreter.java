package DiceItUP;

public class NotationInterpreter {

    private final int ROLLS_PART = 0;
    private final int SIDES_PART = 1;

    Dice die = new Dice(0);
    int[] lastResult;

    public int[] getLastResult() {
        return lastResult;
    }

    public int[] interpret(String request) {

        int del = request.indexOf('d');
        String[] requestParts = request.split("d");

        int[] results = new int[Integer.parseInt(requestParts[ROLLS_PART])];
        die.setSides(Integer.parseInt(requestParts[SIDES_PART]));

        for(int i = 0; i < results.length; i++) {
            die.roll();
            results[i] = die.getCurrentSide();
        }

        this.lastResult = results;

        return results;
    }

}
