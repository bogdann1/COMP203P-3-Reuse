package ucl.cs.strategy;

public class TriangularNumbersTermGenerator implements TermGenerator {


    @Override
    public int positiveTerm(int i) {
        return (i + 1) * (i + 2) / 2;
    }
}