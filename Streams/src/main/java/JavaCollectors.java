import java.util.*;
import java.util.stream.Collectors;

public class JavaCollectors {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(3,4,5,6,6,7);

        //toCollection(Supplier) : is used to create a collection using collector
        //Collection can be List, Set,...
        System.out.println("****ToCOLLECTION()****");
        List<Integer> numberList = numbers.stream()
                .filter(x -> x%2==0) // filtering the stream: Stream now has 4,6,6
                .collect(Collectors.toCollection(ArrayList::new)); // I want to hold these values as an Array
        System.out.println(numberList);

        Set<Integer> numberSet = numbers.stream() // Set eliminates duplicates elements
                .filter(x -> x%2==0)
                .collect(Collectors.toCollection(HashSet::new));
        System.out.println(numberSet);

        //toList() : returns a Collector interface that gathers the input data into a new list
        System.out.println("******TOLIST()******");
        List<Integer> numberList2 = numbers.stream()
                .filter(x -> x%2==0)
                .collect(Collectors.toList());
        System.out.println(numberList2);

        //toSet() : returns a Collector interface that gathers the input data into a new Set
        System.out.println("******TOSET()******");
        Set<Integer> numberSet2 = numbers.stream()
                .filter(x -> x%2==0)
                .collect(Collectors.toSet());
        System.out.println(numberSet2);

        //toMap(Function,Function) : returns a Collector interface that gathers the input data into a new map
        // Map requires a key and Value: key could be Dish name and Value could be Dish calories
        System.out.println("******TOMAP()******");
        Map<String,Integer> dishMap = DishData.getAll().stream()
                .collect(Collectors.toMap(Dish::getName,Dish::getCalories));

        System.out.println(dishMap);

        //counting() : returns a Collector that counts the number of the elements
        System.out.println("******COUNTING******");
        Long evenCount = numbers.stream()
                .filter(x -> x%2==0)
                .collect(Collectors.counting());

        System.out.println(evenCount);

        //summingInt(ToIntFunction) : return a collector that produces the sum of an integer value func
        System.out.println("******SUMMING()******");
        Integer sum = DishData.getAll().stream()
                .collect(Collectors.summingInt(Dish::getCalories));
        System.out.println(sum);

        //averagingInt(ToIntFunction) : returns the average of the integers passed values
        Double calorieAvg = DishData.getAll().stream()
                .collect(Collectors.averagingInt(Dish::getCalories));
        System.out.println(calorieAvg);

        //joining() : used to join various elements of a character or string array into a single string object
        System.out.println("******JOINING()******");
        List<String> courses = Arrays.asList("Java","JS","TS");
        String str = courses.stream()
                .collect(Collectors.joining(","));
        System.out.println(str);

        // I stopped the video at 41 minutes
        //partitioningBy(): used to partition a Stream of object( or set of elements) based on a giving predicate
        System.out.println("******PartitioningBy()******");
        Map<Boolean,List<Dish>> veggieDish = DishData.getAll().stream()
                .collect(Collectors.partitioningBy(Dish::isVegetarian));
        System.out.println(veggieDish);

        //groupingBy(): used fo grouping objects by some property and storing results in a map instance
        System.out.println("******groupingBy()******");
        Map<Type,List<Dish>> dishType = DishData.getAll().stream()
                .collect(Collectors.groupingBy(Dish::getType));
        System.out.println(dishType);


    }
}
