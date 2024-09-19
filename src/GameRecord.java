import java.util.TreeMap;

public class GameRecord {
    static TreeMap<Integer, Integer> recordMap = new TreeMap<>();

    static TreeMap<Integer, Integer> gameRecord () {
        int gameCounts = PlayGame.getGameCounts();
        int trialCounts = MatchNumbers.getTrialCounts();
        recordMap.put(gameCounts, trialCounts);
        return recordMap;
    }

    static TreeMap<Integer, Integer> level4Record () {
        int Level4GameCounts = PlayLevel4.getLevel4Counts();
        int Level4TrialCounts = MatchNumbers4.getLevel4TrialCounts();
        recordMap.put(Level4GameCounts, Level4TrialCounts);
        return recordMap;
    }

    static TreeMap<Integer, Integer> level5Record () {
        int Level5GameCounts = PlayLevel5.getLevel5Counts();
        int Level5TrialCounts = MatchNumber5.getLevel5TrialCounts();
        recordMap.put(Level5GameCounts, Level5TrialCounts);
        return recordMap;
    }

    static void showRecord () {
        for (int key : recordMap.keySet()) {
            Integer value = recordMap.get(key);
            System.out.println(key + "번 째 게임 - 시도 횟수: " + value);
        }
    }
}