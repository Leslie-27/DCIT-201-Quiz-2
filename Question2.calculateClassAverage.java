
public class Main {
    public static void main(String[] args) {

    }
    public static double calculateClassAverage(double score1, double score2) {
        double result = (score1 + score2) / 2;
        return result

    }

    public static double calculateClassAverage(double score1, double score2, double score3) {
        double result = (score1 + score2 + score3) / 3;
        return result

    }

    public static double calculateClassAverage(double[] scores) {
        double sum = 0;
        for (int i = 0; i < scores.length; i++) {
            sum += scores[i];
        }
        return sum / scores.length;

    }
}
