import java.util.InputMismatchException;
import java.util.Scanner;

public class Beginning {
    boolean validInside = true;
    boolean validOutside = true;
    int input;

    int begin () {
        System.out.println("0. 자리수 설정 1. 게임 시작하기 2. 게임 기록 보기 3. 종료하기");
        Scanner inputValue = new Scanner(System.in);

        while (validOutside) {
            while (validInside) {
                try {
                    input = inputValue.nextInt();
                    validOutside = false;
                    if (!(input == 0 || input == 1 || input == 2 || input == 3)) {
                        System.out.println("잘못된 입력입니다");
                        System.out.println("0, 1, 2, 3 중 하나를 입력하세요");
                    } else {
                        validInside = false;
                    }
                } catch (InputMismatchException e) {
                    validOutside = true;
                    System.out.println("0, 1, 2, 3 중 하나를 입력하세요");
                    break;
                }
            }
        }
    return input;
    }
}