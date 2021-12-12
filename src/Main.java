import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(10);
        numbers.add(15);
        numbers.add(180);


        IRandomRule maxRandomRule = new MaxRandomRule(10);
        RandomGenerator maxGenerator = new RandomGenerator(maxRandomRule);

        System.out.println(maxGenerator.generate(20).toString());

        IRandomRule randomRule = new RangeRandomRule(2, 10);
        RandomGenerator randomGenerator = new RandomGenerator(randomRule);

        System.out.println(randomGenerator.generate(10).toString());

        ListRandomRule listRandomRule = new ListRandomRule(numbers);
        RandomGenerator randomGenerator1 = new RandomGenerator(listRandomRule);

        System.out.println(randomGenerator1.generate(2).toString());


    }
}
