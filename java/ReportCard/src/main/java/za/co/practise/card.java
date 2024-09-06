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
        System.out.println("MATH - Report Card");
        int number = getTestNumber();
        double avg = getTestScores(number);
        String grade = determineGrade(avg);
        System.out.println("Percentage: "+avg+"%");
        System.out.println("Grade: "+grade);
    }

    private static String determineGrade(double avg) {
        for (Map.Entry<String,double[]> entrypoint : percentage.entrySet()){
            double[] range = entrypoint.getValue();

            if (avg >= range[0] && avg <= range[1]){
                return entrypoint.getKey();
            }
        }
        return null;
    }

    private static double getTestScores(int number) {
        double avg = 0;
        int total = 0;
        int totalTest = 100 * number;
        try {
            for (int i = 1; i < number+1; i++) {
                System.out.print("Enter Test "+ i +" score:");
                int score = sc.nextInt();

                if (0 <= score && score<= 100){
                    total += score;
                }else {
                    System.out.println("Invalid entry");
                    total += 0;
                    sc.next();
                }
            }
            
            avg = (double) (total * 100) / totalTest;
            return avg;

        }catch (InputMismatchException e){
            System.out.println("Invalid Entry");
        }
        return avg;
    }
    private static int getTestNumber() {
        try {
            System.out.print("\nHow Many Test have You Written: ");
            return sc.nextInt();
        }catch (InputMismatchException e){
            System.out.println("Invalid Entry");
        }

        return 0;
    }
}