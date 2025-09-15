import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int teams = in.nextInt();
        int players = in.nextInt();

        int bestTeam = 0;
        long bestScore = Long.MIN_VALUE;

        for (int t = 0; t < teams; t++) {
            long total = 0;
            for (int p = 0; p < players; p++) {
                total += in.nextInt();
            }
            if (total > bestScore) {
                bestScore = total;
                bestTeam = t;
            }
        }

        System.out.println(bestTeam);
    }
}

