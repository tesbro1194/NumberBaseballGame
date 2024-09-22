import java.util.ArrayList;
import java.util.Scanner;

public class InputNumbers {

    public static ArrayList<Integer> getInputNumbers () {
        ArrayList<Integer> inputArrayList = new ArrayList<>();
        boolean valid = true;
        int int0;
        int int1;
        int int2;
        int int3=0;
        int int4=-1;

        while (valid) {
            Scanner inputNumber = new Scanner(System.in);
            String strAnswerNumber = inputNumber.nextLine();
            // 입력값이 100의 자리 ~ 10000의 자리가 아닌 경우
            if (strAnswerNumber.length()<=2 || strAnswerNumber.length() >= 6) {
                System.out.println("잘못된 입력입니다.");
            } else {
                valid = false;
            }
            // 예외처리, String 타입으로 받은 입력값이 정수가 아닌 경우
            try {
                int number = Integer.parseInt(strAnswerNumber);
            } catch (NumberFormatException e) {
                System.out.println("잘못된 입력입니다.");
            }

            // 문자의 아스키코드를 즉 1부터 9라는 수의 문자가 갖는 아스키코드를 가져오므로 - '0' 을 해야함.
            int0 = strAnswerNumber.charAt(0) - '0';
            int1 = strAnswerNumber.charAt(1) - '0';
            int2 = strAnswerNumber.charAt(2) - '0';

            int[] Ints = {int0, int1, int2};
            for (int i : Ints) {
                inputArrayList.add(i);
            }

            if (strAnswerNumber.length() >= 4) {
                int3 = strAnswerNumber.charAt(3) - '0';
                inputArrayList.add(int3);
            }
            if (strAnswerNumber.length() >= 5) {
                int4 = strAnswerNumber.charAt(4) - '0';
                inputArrayList.add(int4);
            }
            if (int0 == int1 || int0 == int2 || int0 == int3 || int0 == int4 ||
                    int1 == int2 || int1 == int3 || int1 == int4 ||
                    int2 == int3 || int2 == int4 || int3 == int4) {
                System.out.println("중복된 숫자를 입력하였습니다");
            }
        }
        return inputArrayList;
    }
}