package DiceItUP;
import java.util.Scanner;

public class NotationInterpreterTest {

    public static void main(String args[]) {

        Scanner scan = new Scanner(System.in);
        NotationInterpreter interpreter = new NotationInterpreter();
        System.out.println("Enter notation to interpret :> ");
        String notation = scan.nextLine();
        int[] results = interpreter.interpret(notation);

        String output = "Rolling " + notation + ":";
        for(int i = 0; i < results.length; i++) {

           output += " " + results[i];
        }

        System.out.println(output);
    }
}
