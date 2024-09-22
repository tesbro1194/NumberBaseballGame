import java.util.ArrayList;


public class MatchNumbers {
    int ballCount;
    int strikeCount;
    static int trialCounts;
    boolean valid;

    // 조건 1: 입력 숫자가 리스트에 포함되어 있으면 볼, 조건 2: 그중 인덱스-형변환의 이유-가 맞는 경우 볼 -- 스트라이크 ++,
    // 자리의 수 하나 당 위의 두 조건만 만족하면 되므로(다른 경우는 신경쓸 필요 없으므로) 중첩 if문 사용
    boolean operate (ArrayList<Integer> arrayList, int a, int b, int c) {
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
}
