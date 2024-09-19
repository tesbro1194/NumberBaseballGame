import java.util.ArrayList;


public class MatchNumbers {
    int ballCount;
    int strikeCount;
    static int trialCounts;



    boolean operate (ArrayList<Integer> arrayList, int a, int b, int c, boolean valid) {
        if (arrayList.contains(a)) {
            ballCount ++;
            if (arrayList.get(0)==a) {
                strikeCount ++;
                ballCount --;
            }
        }
        if (arrayList.contains(b)) {
            ballCount ++;
            if (arrayList.get(1)==b) {
                strikeCount ++;
                ballCount --;
            }
        }
        if (arrayList.contains(c)) {
            ballCount ++;
            if (arrayList.get(2)==c) {
                strikeCount ++;
                ballCount --;
            }
        }

        if (strikeCount == 3) {
            strikeCount = 0;
            ballCount = 0;
            trialCounts++;
            System.out.println("༼ つ ◕_◕ ༽つ 정답입니다");
            GameRecord.gameRecord();
            trialCounts = 0;
            valid = false;
        } else {
            System.out.println("ball: " + ballCount);
            System.out.println("strike: " + strikeCount);
            trialCounts++;
            strikeCount = 0;
            ballCount = 0;
            valid = true;
        }
    return valid;
    }

    public static int getTrialCounts() {
        return trialCounts;
    }

    public static void setTrialCounts0() {
        trialCounts = 0;
    }
}
