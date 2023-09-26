public class MyMethod {
    public static void main(String[] args) {
        calculateScore(
                true,
                800,
                15,
                200
        );

        System.out.println("You're "+ calculateMyAge(2002) + " years old :(");
        System.out.println("Calculated and return: "+ calculateScoreAndReturn(true, 200,3,100));

    }

    public static void calculateScore(
            boolean gameOver,
            int score,
            int levelsCompleted,
            int bonus
    ) {
            int finalScore = score;
        if(gameOver) {
            finalScore += (levelsCompleted * bonus);
            finalScore += 1000;
            System.out.println("Final score is : "+ finalScore);
        }

    }

    public static int calculateScoreAndReturn(
            boolean gameOver,
            int score,
            int levelsCompleted,
            int bonus
    ) {
        int finalScore = score;

        if(gameOver) {
            finalScore += (levelsCompleted * bonus);
            finalScore += 1000;
            return  finalScore;
        }
        return finalScore;
    }
    public static int calculateMyAge(int year) {
        return  (2023 - year);
    }
}
