import java.util.InputMismatchException;
import java.util.Scanner;

public class InpuetNumber {
    public int first;
    public int second;
    public int third;


    public InpuetNumber(int first, int second, int third) {
        this.first = first;
        this.second = second;
        this.third = third;
    }

    public static InpuetNumber getThreeInts() {
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

                int answerNumber = inputNumber.nextInt();
                int0 = answerNumber / 100;
                int1 = (answerNumber / 10) % 10;
                int2 = answerNumber % 10;

                if (answerNumber >= 100 && answerNumber <= 999) {
                    if (int0 == int1 || int0 == int2 || int1 == int2) {
                        System.out.println("중복된 숫자를 입력하였습니다");
                        System.out.println("세 자리 수의 자연수를 입력하세요");
                        inputNumber.nextInt();
                    } else {
                        valid = false;
                    }
                } else {
                    System.out.println("잘못된 입력입니다. 세 자리 수를 자연수를 입력하세요");
                    inputNumber.nextInt();
                }
            } catch (InputMismatchException e) {
                System.out.println("잘못된 입력입니다. 세 자리 수의 자연수를 입력하세요");
                inputNumber.nextInt();
            }
        }
        return new InpuetNumber(int0, int1, int2);
    }
}