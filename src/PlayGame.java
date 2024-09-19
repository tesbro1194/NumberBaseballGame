import java.util.ArrayList;
import java.util.Scanner;

public class PlayGame {
    boolean endGameKey = false;
    static int gameCounts = 1;
    boolean restartInput;

    public boolean playGames () {
        do {
            MakeNumber makeNumber = new MakeNumber();
            ArrayList<Integer> numberList = new ArrayList<>(makeNumber.makeNumbers());
            System.out.println(numberList);

            MatchNumbers matchNumbers = new MatchNumbers();
            System.out.println();
            System.out.println("게임을 시작합니다");

            do {
                InputNumber threeInts = InputNumber.getThreeInts();
                endGameKey = matchNumbers.operate(numberList, threeInts.first,
                        threeInts.second, threeInts.third, endGameKey);
            } while (endGameKey);

            System.out.println("* 숫자 야구 게임 *");
            System.out.println("1. 게임 다시 하기 2. 게임 기록 보기 3. 종료하기");

            Scanner ReMenu = new Scanner(System.in);
            String InputReMenuButtons = ReMenu.next();

            switch (InputReMenuButtons) {
                case "1" -> {
                    gameCounts++;
                    restartInput = true;
                }
                case "2" -> {
                    gameCounts++;
                    GameRecord.showRecord();
                    restartInput = true;
                }
                case "3" -> {
                    restartInput = false;
                }
                default -> {
                    System.out.println("잘못된 입력입니다");
                    System.out.println("게임을 종료합니다");
                }
            }
        } while (restartInput);
    return restartInput;
    }
    public static int getGameCounts() {
        return gameCounts;
    }
}
