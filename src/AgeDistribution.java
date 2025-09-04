import java.util.Random;

public class AgeDistribution {
    public static void main(String[] var0) {
        int[][] var1 = new int[][]{{8, 19}, {49, 23}, {87, 29}, {92, 37}, {95, 45}, {100, 50}};
        int[] var2 = new int[6];
        Random var3 = new Random();

        for(int var4 = 0; var4 < 1000; ++var4) {
            int var5 = var3.nextInt(100) + 1;

            int var6;
            for(var6 = 0; var5 > var1[var6][0]; ++var6) {
            }

            int var10002 = var2[var6]++;
        }

        System.out.println("| Age | Count | Percent |");
        System.out.println("|-----|-------|---------|");

        for(int var9 = 0; var9 < var1.length; ++var9) {
            int var10 = var1[var9][1];
            int var11 = var2[var9];
            double var7 = (double)var11 / (double)1000.0F * (double)100.0F;
            System.out.printf("| %3d | %5d | %7.2f%% |\n", var10, var11, var7);
        }

    }
}
