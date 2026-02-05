
public class Main {
    public static void main(String[] args) {
        executeGradeReport(0);
    }

    public static void executeGradeReport(double score) {

        if (!validateScore(score)) {
            System.out.println("Invalid Score");
            return;
        }

        char grade = calculateLetterGrade(score);

        displayPerformanceMessage(grade);
    }
    public static boolean validateScore(double score) {
        return true;
    }
    public static char calculateLetterGrade(double score) {
        return 'i';
    }
    public static void displayPerformanceMessage(char grade) {
        System.out.println("Final feedback displayed");
    }

        }
        return sum / scores.length;

    }
}
