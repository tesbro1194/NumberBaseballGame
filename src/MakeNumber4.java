import java.util.LinkedHashSet;
import java.util.Random;

public class MakeNumber4 {
    int a;
    int b;
    int c;
    int d;
    Random random = new Random();

    public MakeNumber4 (){
    }

    LinkedHashSet<Integer> makeNumbers4 () {
        LinkedHashSet<Integer> numberSet = new LinkedHashSet<>();
        a = random.nextInt(9) + 1;
        numberSet.add(a);
        do {
            b = random.nextInt(9) + 1;
            numberSet.add(b);
        } while (b==a);
        do {
            c = random.nextInt(9) + 1;
            numberSet.add(c);
        } while (c==a || c==b);
        do {
            d = random.nextInt(9) + 1;
            numberSet.add(d);
        } while (d==a || d==b || d==c);
        return numberSet;
    }
}
