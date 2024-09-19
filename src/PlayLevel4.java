import java.util.ArrayList;
import java.util.Scanner;

public class PlayLevel4 {
    boolean endGameKey = false;
    static int gameCounts = 1;
    boolean restartInput;

    public boolean playLevel4 () {
        do {
            MakeNumber4 makeNumber4 = new MakeNumber4();
            ArrayList<Integer> numberList = new ArrayList<>(makeNumber4.makeNumbers4());
            System.out.println(numberList);

            MatchNumbers4 matchNumbers4 = new MatchNumbers4();
            System.out.println();
            System.out.println("게임을 시작합니다");

            do {
                InputNumber4 forInts = InputNumber4.getForInts();
                endGameKey = matchNumbers4.operate4(numberList, forInts.first,
                        forInts.second, forInts.third, forInts.forth ,endGameKey);
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
    public static int getLevel4Counts() {
        return gameCounts;
    }
}
