import java.util.ArrayList;
import java.util.Scanner;

public class PlayGames {
    boolean endGameKey = false;
    static int gameCounts = 1;
    boolean restartInput;

    // playKey 를 통해 몇 자리 수의 게임을 할 것인지 지정.
    public void playGames (int playKey) {
        // 게임을 최초 1회 무조건 실행하고 선택에 따라 게임을 반복하게 하기 위해 do-while 사용
        do {
            MakeNumbers makeNumbers = new MakeNumbers();
            // makeNumbers()를 통해 생성된 Set을 ArrayList로 형변환.
            // 인덱스가 없는 것에서 있는 것으로 변환하기 위함.
            ArrayList<Integer> numberList = new ArrayList<>(makeNumbers.makeNumbers(playKey));
            System.out.println(numberList);

            MatchNumbers matchNumbers = new MatchNumbers();

            System.out.println();
            System.out.println("게임을 시작합니다");



            if (playKey==3) {
                do {
                    ArrayList<Integer> Ints = InputNumbers.getInputNumbers();
                    endGameKey = matchNumbers.matchNumbers(numberList, Ints.get(0),
                            Ints.get(1), Ints.get(2));
                } while (endGameKey);
            } else if (playKey==4) {
                do {
                    ArrayList<Integer> Ints = InputNumbers.getInputNumbers();
                    endGameKey = matchNumbers.matchNumbers(numberList, Ints.get(0), Ints.get(1),
                            Ints.get(2), Ints.get(3));
                } while (endGameKey);
            } else if (playKey==5) {
                do {
                    ArrayList<Integer> Ints = InputNumbers.getInputNumbers();
                    endGameKey = matchNumbers.matchNumbers(numberList, Ints.get(0), Ints.get(1), Ints.get(2),
                            Ints.get(3), Ints.get(4));
                } while (endGameKey);
            }


            System.out.println("* 숫자 야구 게임 *");
            System.out.println("1. 게임 다시 하기 2. 게임 기록 보기 3. 종료하기");

            Scanner ReMenu = new Scanner(System.in);
            int InputReMenuButtons = ReMenu.nextInt();

            switch (InputReMenuButtons) {
                case 1 -> {
                    gameCounts++;
                    restartInput = true;
                }
                case 2 -> {
                    gameCounts++;
                    GameRecord.showRecord();
                    restartInput = true;
                }
                case 3 -> {
                    restartInput = false;
                }
                default -> {
                    System.out.println("잘못된 입력입니다");
                    System.out.println("게임을 종료합니다");
                    restartInput = false;
                }
            }
        } while (restartInput);
    }

    public static int getGameCounts () {
        return gameCounts;
    }
}