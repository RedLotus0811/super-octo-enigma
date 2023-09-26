public class MethodsChallenge {
    public static void main(String[] args) {

        int score = 25;
        int pos = calculateHighScorePosition(score);
        displayHighScorePosition("Person 1", pos);
    }

    public static void displayHighScorePosition(String name, int position) {
        System.out.println(name + " managed to get into position "+ position + " on the high score list");
    }

    public static int calculateHighScorePosition(int score) {
        int defaultPosition = 4;

        if(score >= 1000) {
            return  1;
        } else if (score >= 500) {
            return 2;
        } else if (score >= 100){
            return 3;
        }
        return  defaultPosition;
    }
}
