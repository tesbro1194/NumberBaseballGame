import java.util.Scanner;

public class InputNumber5 {
    public int first;
    public int second;
    public int third;
    int forth;
    int fifth;


    public InputNumber5 (int first, int second, int third, int forth, int fifth) {
        this.first = first;
        this.second = second;
        this.third = third;
        this.forth = forth;
        this.fifth = fifth;
    }

    public static InputNumber5 getFiveInts() {
        System.out.println();
        System.out.println("다섯 자리 수의 자연수를 입력하세요");
        Scanner inputNumber = new Scanner(System.in);
        boolean valid = true;
        int int0 = 0;
        int int1 = 0;
        int int2 = 0;
        int int3 = 0;
        int int4 = 0;

        while (valid) {
            try {
                System.out.println((MatchNumber5.getLevel5TrialCounts() + 1) + "번 째 시도입니다");

                String StrAnswerNumber = inputNumber.nextLine();
                int answerNumber = Integer.parseInt(StrAnswerNumber);
                int0 = answerNumber / 10000;
                int1 = (answerNumber / 1000) % 10;
                int2 = (answerNumber / 100) % 10;
                int3 = (answerNumber / 10) % 10;
                int4 = answerNumber % 10;

                if (answerNumber >= 10000 && answerNumber <= 99999) {
                    if (int0 == int1 || int0 == int2 || int0 == int3 || int0 == int4 ||
                            int1 == int2 || int1 == int3 || int1 == int4 ||
                            int2 == int3 || int2 == int4 || int3 == int4) {
                        System.out.println("중복된 숫자를 입력하였습니다");
                        System.out.println("다섯 자리 수의 자연수를 입력하세요");
                        inputNumber.nextInt();
                    } else {
                        valid = false;
                    }
                } else {
                    System.out.println("잘못된 입력입니다. 다섯 자리 수를 자연수를 입력하세요");
                    inputNumber.nextInt();
                }
            } catch (NumberFormatException e) {
                System.out.println("잘못된 입력입니다. 다섯 자리 수의 자연수를 입력하세요");
                inputNumber.nextInt();
            }
        }
        return new InputNumber5(int0, int1, int2, int3, int4);
    }
}