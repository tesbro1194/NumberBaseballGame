public class Main {
    public static void main(String[] args)  {
//        MakeNumber makeNumber = new MakeNumber();
//        ArrayList<Integer> numberList = new ArrayList<>(makeNumber.makeNumbers());
        // numberList 를 섞어서 크기대로 나열되는 문제 해결 ?
        // 애초에 왜 크기대로 나열되는 것일까요.
//        System.out.println(numberList);
//        boolean endGameKey = false;

//        do {
//
//        } while ();
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



