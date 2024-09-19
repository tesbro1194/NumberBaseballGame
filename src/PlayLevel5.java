import java.util.ArrayList;
import java.util.Scanner;

public class PlayLevel5 {
    boolean endGameKey = false;
    static int gameCounts = 1;
    boolean restartInput;

    public boolean playLevel5 () {
        do {
            MakeNumber5 makeNumber5 = new MakeNumber5();
            ArrayList<Integer> numberList = new ArrayList<>(makeNumber5.makeNumbers5());
            System.out.println(numberList);

            MatchNumber5 matchNumbers5 = new MatchNumber5();
            System.out.println();
            System.out.println("게임을 시작합니다");

            do {
                InputNumber5 fiveInts = InputNumber5.getFiveInts();
                endGameKey = matchNumbers5.operate5(numberList, fiveInts.first,
                        fiveInts.second, fiveInts.third, fiveInts.forth, fiveInts.fifth, endGameKey);
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
    public static int getLevel5Counts() {
        return gameCounts;
    }
}