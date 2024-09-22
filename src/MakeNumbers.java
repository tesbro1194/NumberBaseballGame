import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class MakeNumbers {
    // 자리수를 지칭하는 a가 주어졌을 때, numberSet 에 자리수에 맞게 숫자의 갯수가 채워짐.
    ArrayList<Integer> makeNumbers (int a) {
        ArrayList<Integer> numberSet = new ArrayList<>();
        Integer[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        Collections.shuffle(Arrays.asList(numbers)); // 배열 섞기

        for (int i=0; i<a; i++) {
            numberSet.add(i);
            numberSet.set(i, numbers[i]);
        }
        return numberSet;
    }
}