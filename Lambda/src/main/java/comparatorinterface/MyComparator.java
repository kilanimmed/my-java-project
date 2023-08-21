package comparatorinterface;

import java.util.Comparator;

public class MyComparator implements Comparator<Integer> { // Comparator is a functional interface has a method, we need
    @Override                                              // to override that method
    public int compare(Integer o1, Integer o2) {
        return (o1>o2) ? -1 : (o1<o2) ? 1 : 0;
    }
}
