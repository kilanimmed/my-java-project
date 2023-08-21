package comparatorinterface;

import java.util.*;

import static java.util.Comparator.comparing;

public class ComparatorDemo {
    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(10,0,15,5,20);
        System.out.println(list);
        //Ascending order
        Collections.sort(list);
        System.out.println(list);

        //Descending order = normal implementation which behavior parameterization
        Collections.sort(list,new MyComparator());
        System.out.println(list);

        //if functional interface has only one abstract method,we can skip the middle layer and directly paste your action as a Lambda exp
        Collections.sort(list,(((o1, o2) -> (o1>o2) ? -1 : (o1<o2) ? 1:0)));

        //Ascending: using compareTo method
        list.sort((o1, o2) -> o1.compareTo(o2));
        System.out.println(list);

        //Descending
        list.sort((o2,o1) -> o2.compareTo(o1));
        System.out.println(list);

        List<Apple> myInventory =Arrays.asList(
                new Apple(80,Color.GREEN),
                new Apple(155,Color.RED),
                new Apple(120, Color.GREEN)
        );
        // We will try to sort this list based on Apple weight, Apple is an Object using Comparing static method belongs to Comparator class
        Comparator<Apple> sortApple = comparing((apple) -> apple.getWeight());
        myInventory.sort(sortApple);
        System.out.println(myInventory);

        //without using Comparator class, import static method
        myInventory.sort(comparing((apple) -> apple.getWeight()));

        //Reversed
        





    }
}
