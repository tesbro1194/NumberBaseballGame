import java.util.LinkedHashSet;
import java.util.Random;

public class MakeNumber5 {
    int a;
    int b;
    int c;
    int d;
    int e;

    Random random = new Random();

    public MakeNumber5 (){
    }

    LinkedHashSet<Integer> makeNumbers5 () {
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
        do {
            e = random.nextInt(9) + 1;
            numberSet.add(e);
        } while (e==a || e==b || e==c || e==d);
        return numberSet;
    }
}