import java.util.List;
import java.util.Random;


public class ListRandomRule implements IRandomRule {


    private final List<Integer> numbers;

    public ListRandomRule(List<Integer> numbers) {
        this.numbers = numbers;
    }

    @Override

    public int nextInt() {
        Random rnd = new Random();
        return numbers.get(rnd.nextInt(numbers.size()));
    }
}

