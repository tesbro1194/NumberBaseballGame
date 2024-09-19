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

        while (valid) {
            try {
                System.out.println((MatchNumbers.getTrialCounts() + 1) + "번 째 시도입니다");

                String StrAnswerNumber = inputNumber.nextLine();
                int answerNumber = Integer.parseInt(StrAnswerNumber);
                int0 = answerNumber / 100;
                int1 = (answerNumber / 10) % 10;
                int2 = answerNumber % 10;

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
//            catch () { 예외 추가 가능
//
//            }
        }
        return new InputNumber(int0, int1, int2);
    }
}