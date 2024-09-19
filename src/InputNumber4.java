import java.util.Scanner;

public class InputNumber4 {
    public int first;
    public int second;
    public int third;
    int forth;


    public InputNumber4 (int first, int second, int third, int forth) {
        this.first = first;
        this.second = second;
        this.third = third;
        this.forth = forth;
    }

    public static InputNumber4 getForInts() {
        System.out.println();
        System.out.println("네 자리 수의 자연수를 입력하세요");
        Scanner inputNumber = new Scanner(System.in);
        boolean valid = true;
        int int0 = 0;
        int int1 = 0;
        int int2 = 0;
        int int3 = 0;

        while (valid) {
            try {
                System.out.println((MatchNumbers4.getLevel4TrialCounts() + 1) + "번 째 시도입니다");

                String StrAnswerNumber = inputNumber.nextLine();
                int answerNumber = Integer.parseInt(StrAnswerNumber);
                int0 = answerNumber / 1000;
                int1 = (answerNumber / 100) % 10;
                int2 = (answerNumber / 10) % 10;
                int3 = answerNumber % 10;

                if (answerNumber >= 1000 && answerNumber <= 9999) {
                    if (int0 == int1 || int0 == int2 || int0 == int3||
                            int1 == int2 || int1 == int3 || int2 == int3 ) {
                        System.out.println("중복된 숫자를 입력하였습니다");
                        System.out.println("네 자리 수의 자연수를 입력하세요");
                        inputNumber.nextInt();
                    } else {
                        valid = false;
                    }
                } else {
                    System.out.println("잘못된 입력입니다. 네 자리 수를 자연수를 입력하세요");
                    inputNumber.nextInt();
                }
            } catch (NumberFormatException e) {
                System.out.println("잘못된 입력입니다. 네 자리 수의 자연수를 입력하세요");
                inputNumber.nextInt();
            }
        }
        return new InputNumber4(int0, int1, int2, int3);
    }
}