public class DataStructure {
    private final static int SIZE = 15;
    private int[] arrayOfInts = new int[SIZE];

    public DataStructure() {
        for (int i = 0; i < SIZE; i++) {
            arrayOfInts[i] = i;
        }
    }

    public void iterateAndPrint(DataStructureIterator iterator) {
        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }
        System.out.println();
    }

    public void printEven() {
        this.iterateAndPrint(this.new EvenIterator());
    }

    public void printOdd() {
        this.iterateAndPrint(this.new OddIterator());
    }

    interface DataStructureIterator extends java.util.Iterator<Integer> {}

    private class EvenIterator implements DataStructureIterator {
        private int nextIndex = 0;
        
        public boolean hasNext() {
            return nextIndex < SIZE;
        }

        public Integer next() {
            Integer retValue = Integer.valueOf(arrayOfInts[nextIndex]);
            nextIndex += 2;
            return retValue;
        }
    }

    private class OddIterator implements DataStructureIterator {
        private int nextIndex = 1;
        
        public boolean hasNext() {
            return nextIndex < SIZE;
        }

        public Integer next() {
            Integer retValue = Integer.valueOf(arrayOfInts[nextIndex]);
            nextIndex += 2;
            return retValue;
        }
    }

    public static void main (String[] args) {
        DataStructure ds = new DataStructure();
        ds.printEven();
        ds.printOdd();
    }
}
