package za.co.practise;

import java.util.HashMap;
import java.util.Map;

public class card {
    private static final Map<String,int[]> percentage = new HashMap<>();

    static {
        percentage.put("A", new int[]{93,100});
        percentage.put("A-", new int[]{90,92});
        percentage.put("B+", new int[]{87,89});
        percentage.put("B", new int[]{83,86});
        percentage.put("B-", new int[]{80,82});
        percentage.put("C+", new int[]{77,79});
        percentage.put("C", new int[]{73,76});
        percentage.put("C-", new int[]{70,72});
        percentage.put("D+", new int[]{67,69});
        percentage.put("D",new int[]{63,66});
        percentage.put("D-", new int[]{60,62});
        percentage.put("F", new int[]{0,59});

    }

    public static void main(String[] args) {
        System.out.println("Hello world!");
    }
}