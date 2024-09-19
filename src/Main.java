public class Main {
    public static void main(String[] args)  {
        System.out.println("* 숫자 야구 게임 *");

        Beginning beginning = new Beginning();
        int startKey = beginning.begin();

        switch (startKey) {
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



