package task2;

import java.util.Random;

public class AgeDistribution {
    public static void main(String[] args) {
        final int REITERATIONS = 100_000;
        final int maxAge = 50;
        int[][] ageDistribution = new int[][]{
                {8, 19},
                {49, 23},
                {87, 29},
                {92, 37},
                {95, 45},
                {100, maxAge}
        };
        int[] generatedAges = new int[maxAge];
        // Generate ages according to the distribution:
        for (int i = 1; i <= REITERATIONS; i++){
            //Random random = new Random(10);
            Random random = new Random();
            int x = random.nextInt(100) + 1;
            //int x = (int)(Math.random()*100)+1;
            int j = 0;
            while (x > ageDistribution[j][0]) j++;
            generatedAges[j]++;
        }

        // Output the result of the generation:
        System.out.println("Age  count     %-share");
        for (int i = 0; i < maxAge; i++) {
            if (generatedAges[i] != 0) {
                String str = "%-4d %-8d %-8.2f\n";
                System.out.printf(str, ageDistribution[i][1], generatedAges[i],((double)generatedAges[i])/REITERATIONS*100 );
            }
        }
    }
}