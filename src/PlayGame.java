//import java.util.ArrayList;
//import java.util.Scanner;
//
//public class PlayGame {
//    boolean endGameKey = false;
//    static int gameCounts = 1;
//    boolean restartInput;
//
//    public void playGames () {
//        // 게임을 최초 1회 무조건 실행하고 선택에 따라 게임을 반복하게 하기 위해 do-while 사용
//        do {
//            MakeNumber makeNumber = new MakeNumber();
//            // makeNumbers()를 통해 생성된 Set을 ArrayList로 형변환.
//            // 인덱스가 없는 것에서 있는 것으로 변환하기 위함.
//            ArrayList<Integer> numberList = new ArrayList<>(makeNumber.makeNumbers());
//            System.out.println(numberList);
//
//            MatchNumbers matchNumbers = new MatchNumbers();
//            System.out.println();
//            System.out.println("게임을 시작합니다");
//            // 정답을 맞출 때까지 반복하여 숫자를 입력 받기에 do-while 사용.
//            do {
//                InputNumber threeInts = InputNumber.getThreeInts();
//                endGameKey = matchNumbers.operate(numberList, threeInts.first,
//                        threeInts.second, threeInts.third);
//            } while (endGameKey);
//
//            System.out.println("* 숫자 야구 게임 *");
//            System.out.println("1. 게임 다시 하기 2. 게임 기록 보기 3. 종료하기");
//
//            Scanner ReMenu = new Scanner(System.in);
//            String InputReMenuButtons = ReMenu.next();
//
//            // 입력 숫자 1, 2, 3에 따라 다른 실행을 요구하기 때문에 switch문 사용
//            switch (InputReMenuButtons) {
//                case "1" -> {
//                    gameCounts++;
//                    restartInput = true;
//                }
//                case "2" -> {
//                    gameCounts++;
//                    GameRecord.showRecord();
//                    restartInput = true;
//                }
//                case "3" -> {
//                    restartInput = false;
//                }
//                default -> {
//                    System.out.println("잘못된 입력입니다");
//                    System.out.println("게임을 종료합니다");
//                    restartInput = false;
//                }
//            }
//        } while (restartInput);
//    }
//    public static int getGameCounts() {
//        return gameCounts;
//    }
//}
