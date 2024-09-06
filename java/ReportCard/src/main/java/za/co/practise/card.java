package za.co.practise;

import java.util.HashMap;
import java.util.InputMismatchException;
import java.util.Map;
import java.util.Scanner;

public class card {
    private static final Map<String,double[]> percentage = new HashMap<>();
    private static final Scanner sc = new Scanner(System.in);

    static {
        percentage.put("A", new double[]{93,100});
        percentage.put("A-", new double[]{90,92});
        percentage.put("B+", new double[]{87,89});
        percentage.put("B", new double[]{83,86});
        percentage.put("B-", new double[]{80,82});
        percentage.put("C+", new double[]{77,79});
        percentage.put("C", new double[]{73,76});
        percentage.put("C-", new double[]{70,72});
        percentage.put("D+", new double[]{67,69});
        percentage.put("D",new double[]{63,66});
        percentage.put("D-", new double[]{60,62});
        percentage.put("F", new double[]{0,59});

    }

    public static void main(String[] args) {
        System.out.println("Report Card");
        int number = getTestNumber();

        if (number > 0) {
            double avg = getTestScores(number);
            String grade = determineGrade(avg);
            System.out.printf("Your average score is %.2f, which corresponds to a grade of %s.%n", avg, grade);
        } else {
            System.out.println("No tests to process.");
        }
    }

    private static String determineGrade(double avg) {
        for (Map.Entry<String,double[]> entrypoint : percentage.entrySet()){
            double[] range = entrypoint.getValue();

            if (avg >= range[0] && avg <= range[1]){
                return entrypoint.getKey();
            }
        }
        return "F";
    }

    private static double getTestScores(int number) {
        int total = 0;
        int entries = 100 * number;
        for (int i = 1; i <= number; i++) {
            try {
                System.out.print("Enter Test " + i + " score: ");
                int score = sc.nextInt();
                if (score < 0 || score > 100) {
                    System.out.println("Score must be between 0 and 100. Try again.");
                    i--;
                } else {
                    total += score;
                    entries++;
                }
            } catch (InputMismatchException e) {
                System.out.println("Invalid entry. Please enter a valid integer.");
                sc.next();
                i--;
            }
        }
        return entries > 0 ? (double) total / entries : 0;
    }


    private static int getTestNumber() {
       System.out.print("Enter the number of tests: ");
        try {
            int numberofTests = sc.nextInt();
            if (numberofTests <= 0) {
                System.out.println("Number of tests must be greater than 0.");
                return 0;
            }
            return numberofTests;
        } catch (InputMismatchException e) {
            System.out.println("Invalid entry. Please enter a valid integer.");
            sc.next();
            return 0;
        }
    }
}