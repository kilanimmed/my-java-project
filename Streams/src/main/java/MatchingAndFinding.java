import java.util.Optional;

public class MatchingAndFinding {
    public static void main(String[] args) {
        //All Match
        System.out.println("***All Match***");
        boolean isHealthy = DishData.getAll().stream().allMatch(dish -> dish.getCalories()<1000);

        //Any Match
        System.out.println("***Any Match***");
        if(DishData.getAll().stream().anyMatch(Dish::isVegetarian))
            System.out.println("The menu is vegetarian friendly");

        //None Match
        System.out.println("***None Match***");
        boolean isHealthy2 = DishData.getAll().stream().noneMatch(dish -> dish.getCalories()>=1000);
        System.out.println(isHealthy2);

        //Find Any
        System.out.println("***Find Any***");
        Optional<Dish> dish = DishData.getAll().stream()
                .filter(Dish::isVegetarian)
                .findAny();
        System.out.println(dish.get());

        //Find First
        System.out.println("***Find First***");
        Optional<Dish> dish2 = DishData.getAll().stream()
                .filter(Dish::isVegetarian)
                .findFirst();
        System.out.println(dish2.get());


    }
}
