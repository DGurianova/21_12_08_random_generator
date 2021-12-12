

import java.util.Random;

public class RangeRandomRule implements IRandomRule {
    private final int min;
    private final int max;


    public RangeRandomRule(int min, int max) {
        this.min = min;
        this.max = max;
    }

    @Override
    public int nextInt() {
        Random rnd = new Random();
        return rnd.nextInt((max - min)) + min;
    }
}
