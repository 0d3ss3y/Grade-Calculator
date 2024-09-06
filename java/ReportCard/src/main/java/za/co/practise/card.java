package za.co.practise;

import java.util.HashMap;
import java.util.InputMismatchException;
import java.util.Map;
import java.util.Scanner;

public class card {
    private static final Map<String,double[]> percentage = new HashMap<>();
    private static Scanner sc;

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
        int number = getTestNumber();
        double avg = getTestScores(number);
    }

    private static double getTestScores(int number) {
        try {
            for (int i = 0; i < number; i++) {
                

            }
        }catch (InputMismatchException e){
            System.out.println("Invalid Entry");
        }
        return 0;
    }

    private static int getTestNumber() {
        try {
            sc = new Scanner(System.in);
            return sc.nextInt();
        }catch (InputMismatchException e){
            System.out.println("Invalid Entry");
        }

        return 0;
    }
}