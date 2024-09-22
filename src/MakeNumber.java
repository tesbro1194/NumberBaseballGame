//import java.util.LinkedHashSet;
//import java.util.Random;
//
//public class MakeNumber {
//    int a;
//    int b;
//    int c;
//    Random random = new Random();
//
//    public MakeNumber (){
//    }
//
//    // 정답 숫자 3개 세팅
//    // 중복이 있으면 안되기에 Set와 do-while문 사용
//    LinkedHashSet<Integer> makeNumbers () {
//        LinkedHashSet<Integer> numberSet = new LinkedHashSet<>();
//        a = random.nextInt(9) + 1;
//            numberSet.add(a);
//        do {
//            b = random.nextInt(9) + 1;
//            numberSet.add(b);
//        } while (b==a);
//        do {
//            c = random.nextInt(9) + 1;
//            numberSet.add(c);
//        } while (c==a || c==b);
//    return numberSet;
//    }
//}
