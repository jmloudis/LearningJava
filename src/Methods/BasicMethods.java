package Methods;

public class BasicMethods {

    public static void calculateScore(boolean gameOver, int score, int levelCompleted, int bonus) {
        if (gameOver ==  true) {

            int finalScore = score + (levelCompleted * bonus);
            finalScore += 1000;
            System.out.println("The final Score is: " + finalScore);

        }

    }

}
