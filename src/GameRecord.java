import java.util.TreeMap;

public class GameRecord {
    static TreeMap<Integer, Integer> recordMap = new TreeMap<>();

    static void gameRecord () {
        int gameCounts = PlayGames.getGameCounts();
        int trialCounts = MatchNumbers.getTrialCounts();
        recordMap.put(gameCounts, trialCounts);
    }

    static void showRecord () {
        System.out.println();
        for (int key : recordMap.keySet()) {
            Integer value = recordMap.get(key);
            System.out.println(key + " 번 째 게임의 시도 횟수: " + value);
        }
        System.out.println();
    }
}