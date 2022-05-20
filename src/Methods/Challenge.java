package Methods;

public class Challenge {

    public static void displayHighScorePosition(String playersName, int position){
        System.out.println(playersName + " managed to get into position: " + position);
    }

    public static int calculateHighScorePosition(int playerScore){
        if (playerScore > 100 && playerScore < 500){
            return 3;
        }
        else if (playerScore > 500 && playerScore < 1000) {
            return 2;
        }
        else if (playerScore >= 1000) {

            return 1;
        }
        else{
            return 4;
        }
    }
}
