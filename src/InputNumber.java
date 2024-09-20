import java.util.Scanner;

public class InputNumber {
    public int first;
    public int second;
    public int third;

    public InputNumber(int first, int second, int third) {
        this.first = first;
        this.second = second;
        this.third = third;
    }

    public static InputNumber getThreeInts() {
        System.out.println();
        System.out.println("세 자리 수의 자연수를 입력하세요");
        Scanner inputNumber = new Scanner(System.in);
        boolean valid = true;
        int int0 = 0;
        int int1 = 0;
        int int2 = 0;

        // 올바른 입력값이 나올 때 동안 반복하려고 while문 사용.
        while (valid) {
            try {
                System.out.println((MatchNumbers.getTrialCounts() + 1) + "번 째 시도입니다");

                String StrAnswerNumber = inputNumber.nextLine();
                int answerNumber = Integer.parseInt(StrAnswerNumber);
                int0 = answerNumber / 100;
                int1 = (answerNumber / 10) % 10;
                int2 = answerNumber % 10;
                // 조건 1: 100~999사이의 숫자, 조건 2: 중복 없음
                // 위 두 조건을 만족하면 되고 다른 경우는 고려하지 않아도 되기에 이중 if문 사용
                if (answerNumber >= 100 && answerNumber <= 999) {
                    if (int0 == int1 || int0 == int2 || int1 == int2) {
                        System.out.println("올바르지 않은 입력값입니다.");
                        System.out.println("세 자리 수의 자연수를 입력하세요");
                        inputNumber.nextInt();
                    } else {
                        valid = false;
                    }
                } else {
                    System.out.println("올바르지 않은 입력값입니다. 세 자리 수를 자연수를 입력하세요");
                    inputNumber.nextInt();
                }
                break;
            } catch (NumberFormatException e) {
                System.out.println("올바르지 않은 입력값입니다. 세 자리 수의 자연수를 입력하세요");
            }
        }
        return new InputNumber(int0, int1, int2);
    }
}