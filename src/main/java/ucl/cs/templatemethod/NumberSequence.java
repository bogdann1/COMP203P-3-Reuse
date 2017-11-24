package ucl.cs.templatemethod;

import java.util.Iterator;

/**
 * Created by bogdannitescu on 24/11/2017.
 */
public abstract class NumberSequence implements Iterable<Integer> {
    public int term(int i) {
        if (i < 0) {
            throw new IllegalArgumentException("Not defined for indices < 0");
        }

        return positiveTerm(i);
    }

    protected abstract int positiveTerm(int i);

    public Iterator<Integer> iterator() {
        return new SequenceIterator();
    }

    private class SequenceIterator implements Iterator<Integer> {

        private int index = 0;

        @Override
        public boolean hasNext() {
            return true;
        }

        @Override
        public Integer next() {
            return term(index++);
        }

        @Override
        public void remove() {
            throw new UnsupportedOperationException("remove is not implemented");
        }
    }
}
