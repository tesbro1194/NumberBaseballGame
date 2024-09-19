import java.util.Scanner;

public class Main {
    public static void main(String[] args)  {
        System.out.println("* 숫자 야구 게임 *");

        Beginning beginning = new Beginning();
        int startKey = beginning.begin();

        switch (startKey) {
            case 0:
                System.out.println("설정하고자 하는 자리수를 입력하세요(3, 4, 5)");
                Scanner gameLevel = new Scanner(System.in);
                int inputGameLevel = gameLevel.nextInt();

                if (inputGameLevel == 3) {
                    // 아래 case 1과 동일
                    PlayGame playGameInMain = new PlayGame();
                    boolean restartKey;
                    do {
                        restartKey = playGameInMain.playGames();
                    } while (restartKey);
                }
                if (inputGameLevel == 4) {
                    PlayLevel4 playLevel4InMain = new PlayLevel4();
                    boolean restartKey;
                    do {
                        restartKey = playLevel4InMain.playLevel4();
                    } while (restartKey);
                }
                if (inputGameLevel == 5) {
                    PlayLevel5 playLevel5InMain = new PlayLevel5();
                    boolean restartKey;
                    do {
                        restartKey = playLevel5InMain.playLevel5();
                    } while (restartKey);
                } else {
                    System.out.println("잘못된 입력입니다.");
                    System.out.println("게임을 종료합니다.");
                }

            case 1:
                PlayGame playGameInMain = new PlayGame();
                boolean restartKey;
                do {
                    restartKey = playGameInMain.playGames();
                } while (restartKey);
                break;
            case 2:
                System.out.println("게임을 하지 않았습니다.");
                System.out.println("종료합니다...");
                break;
            case 3:
                System.out.println("다음에 또 만나요.");
                break;
        }
    }
}



