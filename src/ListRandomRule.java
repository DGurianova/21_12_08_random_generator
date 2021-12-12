import java.util.List;
import java.util.Random;

//TODO an object of the class must receive a list of integers through the constructor while created.
// The method nextInt() must pick a number from this list randomly.
public class ListRandomRule implements IRandomRule {


    private final List<Integer> numbers;

    public ListRandomRule(List<Integer> numbers) {
        this.numbers = numbers;
    }

    @Override
    //{10, 15, 90, -8} -> or 10, 15, 90, -8
    public int nextInt() {
        Random rnd = new Random();
        return numbers.get(rnd.nextInt(numbers.size() + 1));
    }
}

