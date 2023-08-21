import java.util.ArrayList;
import java.util.List;

public class AppleTest {

    public static void main(String[] args) {

        List<Apple> inventory = new ArrayList<Apple>();
        inventory.add(new Apple(300, Color.GREEN));
        inventory.add(new Apple(100, Color.GREEN));
        inventory.add(new Apple(200, Color.GREEN));
        inventory.add(new Apple(500, Color.GREEN));

        List<Apple> heavyApple = filterApples(inventory, new AppleHeavyPredicate());
        List<Apple> greenApple = filterApples(inventory, new AppleGreenColorPredicate());

    }

    private static List<Apple> filterApples(List<Apple> inventory, ApplePredicate applePredicate) {
        List<Apple> result = new ArrayList<>();
        for (Apple apple : inventory) {
            if (applePredicate.test(apple)) {
                result.add(apple);
            }
        }
        return result;
    }
}


