import Methods.BasicMethods;
import Methods.Challenge;
import Methods.Overloading;

public class Main {

    public static void main(String[] args) {
        //Operators.Operators.run();
        //BasicMethods.calculateScore(true, 800, 5, 100);

        // Method Challenge
        int highScorePosition = Challenge.calculateHighScorePosition(1500);
        Challenge.displayHighScorePosition("John", highScorePosition);

        // whitespace
        System.out.println(" ");

        // Method Overloading
        Overloading.calcFeetAndInchesToCentimeters(157);
    }
}
