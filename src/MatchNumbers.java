import java.util.ArrayList;

public class MatchNumbers {
    int ballCount;
    int strikeCount;
    static int trialCounts;
    boolean valid;

    // inputNumbers 의 자리수에 따라 로직 수행.
    boolean matchNumbers (ArrayList<Integer> arrayList, int ... inputNumbers) {
        int a = inputNumbers[0];
        int b = inputNumbers[1];
        int c = inputNumbers[2];

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

        switch (inputNumbers.length) {
            case 3 :
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
                break;

            case 4 :
                int d = inputNumbers[3];

                if (arrayList.contains(d)) {
                    ballCount ++;
                    if (arrayList.get(3)==d) {
                        strikeCount ++;
                        ballCount --;
                    }
                }

                if (strikeCount == 4) {
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
                break;

            case 5 :
                int dd = inputNumbers[3];
                int e = inputNumbers[4];

                if (arrayList.contains(dd)) {
                    ballCount ++;
                    if (arrayList.get(3)==dd) {
                        strikeCount ++;
                        ballCount --;
                    }
                }
                if (arrayList.contains(e)) {
                    ballCount ++;
                    if (arrayList.get(4)==e) {
                        strikeCount ++;
                        ballCount --;
                    }
                }

                if (strikeCount == 5) {
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
                break;
        }
        return valid;
    }

    public static int getTrialCounts() {
        return trialCounts;
    }
}
