import java.util.TreeMap;

public class GameRecord {
    static TreeMap<Integer, Integer> recordMap = new TreeMap<>();

    static TreeMap<Integer, Integer> gameRecord () {
        int gameCounts = PlayGame.getGameCounts();
        int trialCounts = MatchNumbers.getTrialCounts();
        recordMap.put(gameCounts, trialCounts);
        return recordMap;
    }

    static void showRecord () {
        for (int key : recordMap.keySet()) {
            Integer value = recordMap.get(key);
            System.out.println(key + "번 째 게임 - 시도 횟수: " + value);
        }
    }
}