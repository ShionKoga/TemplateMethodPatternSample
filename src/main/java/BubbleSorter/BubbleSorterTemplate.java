package BubbleSorter;

public abstract class BubbleSorterTemplate {
  protected int length = 0;
  protected int doSort() {
    int operations = 0;
    if (length <= 1) {
      return operations;
    }

    for (int nextToLast = length -2; nextToLast >= 0; nextToLast--) {
      for (int index = 0; index <= nextToLast; index++) {
        if (outOfOrder(index)) {
          swap(index);
        }
        operations++;
      }
    }
    return operations;
  }
  protected abstract void swap(int index);
  protected abstract boolean outOfOrder(int index);
}
