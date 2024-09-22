//import java.util.ArrayList;
//
//public class MatchNumber4 {
//    int ballCount;
//    int strikeCount;
//    static int trialCounts;
//    boolean valid;
//
//    boolean operate4 (ArrayList<Integer> arrayList, int a, int b, int c, int d) {
//        if (arrayList.contains(a)) {
//            ballCount ++;
//            if (arrayList.get(0)==a) {
//                strikeCount ++;
//                ballCount --;
//            }
//        }
//        if (arrayList.contains(b)) {
//            ballCount ++;
//            if (arrayList.get(1)==b) {
//                strikeCount ++;
//                ballCount --;
//            }
//        }
//        if (arrayList.contains(c)) {
//            ballCount ++;
//            if (arrayList.get(2)==c) {
//                strikeCount ++;
//                ballCount --;
//            }
//        }
//        if (arrayList.contains(d)) {
//            ballCount ++;
//            if (arrayList.get(3)==d) {
//                strikeCount ++;
//                ballCount --;
//            }
//        }
//
//        if (strikeCount == 4) {
//            strikeCount = 0;
//            ballCount = 0;
//            trialCounts++;
//            System.out.println("༼ つ ◕_◕ ༽つ 정답입니다");
//            GameRecord.level4Record();
//            trialCounts = 0;
//            valid = false;
//        } else {
//            System.out.println("ball: " + ballCount);
//            System.out.println("strike: " + strikeCount);
//            trialCounts++;
//            strikeCount = 0;
//            ballCount = 0;
//            valid = true;
//        }
//        return valid;
//    }
//
//    public static int getLevel4TrialCounts() {
//        return trialCounts;
//    }
//}