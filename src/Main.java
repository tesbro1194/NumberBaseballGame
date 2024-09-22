import java.util.Scanner;

public class Main {
    public static void main(String[] args)  {
        System.out.println("* 숫자 야구 게임 *");

        Beginning beginning = new Beginning();
        int startKey = beginning.begin();

        switch (startKey) {
            case 0:
                boolean valid = true;
                do {
                    System.out.println("설정하고자 하는 자리수를 입력하세요(3, 4, 5)");
                    Scanner gameLevel = new Scanner(System.in);
                    String inputGameLevel = gameLevel.next();

                    if (inputGameLevel.equals("3")) {
                        PlayGames playGameInMain = new PlayGames();
                        playGameInMain.playGames(3);
                    } else if (inputGameLevel.equals("4")) {
                        PlayGames playLevel4InMain = new PlayGames();
                        playLevel4InMain.playGames(4);
                    } else if (inputGameLevel.equals("5")) {
                        PlayGames playLevel5InMain = new PlayGames();
                        playLevel5InMain.playGames(5);
                    } else {
                        System.out.println("잘못된 입력입니다.");
                        valid = false;
                    }
                } while (!valid);
                break;
            case 1:
                // 위 if (inputGameLevel == 3)과 동일
                PlayGames playGameInMain = new PlayGames();
                playGameInMain.playGames(3);
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