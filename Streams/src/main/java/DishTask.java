import static java.util.Comparator.comparing;

public class DishTask {
    public static void main(String[] args) {

        //Print all dish's name that hss less than 400 calories
        //Creating Source of Data which is in DishData Class and convert it to Stream
        DishData.getAll().stream()
                .filter(dish -> dish.getCalories()<400) // I am getting all Dish object as a whole but calories<400
                .map(Dish::getName)// now I am getting only Names of the dishes only no other field like Type no
                .forEach(System.out::println);

        //Print the length of the name of each dish
        System.out.println("List of the Names of each Dish");
        DishData.getAll().stream()
                .map(Dish::getName)// now I am getting only Names of the dishes only no other field like Type no
                .map(String::length)
                .forEach(System.out::println);

        // Print Three High Caloric Dish Name > 300
        System.out.println("High Calories Dishes Name:");
        DishData.getAll().stream()
                .filter(dish -> dish.getCalories()>300) // I am getting all Dish object as a whole but calories<400
                .map(Dish::getName)// now I am getting only Names of the dishes only no other field like Type no
                .limit(3)
                .forEach(System.out::println);

        //Print all dish name that are below 400 calories in sorted
        System.out.println("Below 400 Cal Dishes");
        DishData.getAll().stream()
                .filter(dish -> dish.getCalories()<400) // I am getting all Dish object as a whole but calories<400
                .sorted(comparing(Dish::getCalories).reversed())
                .map(Dish::getName)
                .forEach(System.out::println);


    }
}
