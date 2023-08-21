import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamOperations {
    public static void main(String[] args) {

        List<Integer> myList = Arrays.asList(1,2,3,4,3,5,9,2,2,6);
        myList.forEach(x -> System.out.println(x)); // using Consumer Interface, it accepts one parameter and does not return anything
        myList.forEach(System.out::println);// same thing as the line ahead, also remember that forEach belongs to Iterable interface

        //Filter: forEach here is different, it belongs to Stream Interface and does same thing also with terminal Operations
        myList.stream().filter(i -> i%3 == 0).forEach(System.out::println);
        // We can do same thing and show only distinct ones using multiple operations on the stream
        myList.stream()
                .filter(i -> i%3 == 0)
                .distinct()
                .forEach(System.out::println);
        //Limit
        System.out.println("LIMIT"); //
        myList.stream() // Creating new Stream after ending the previous one
                .filter(i -> i%2==0)
                .limit(1)
                .forEach(System.out::println);

        //SKIP
        System.out.println("SKIP");
        myList.stream()
                .filter(i -> i%2==0)
                .skip(2)
                .forEach(System.out::println);

        //MAP
        System.out.println("MAP");
        myList.stream()
                .map(number -> number*2)
                .filter(i -> i%3==0)
                .forEach(System.out::println);

        //TASK
        System.out.println("TASK using my way");
        List<String> words = Arrays.asList("JAVA","APPLE","HONDA","DEVELOPER");
        words.stream()
                .forEach(str -> System.out.println(str.length()));

        //TASK using Ozzy way with MAP
        System.out.println("TASK using Ozzy way with MAP");
        words.stream()
                .map(w -> w.length())
                .forEach(System.out::println);
        // TASK using Ozzy more simplified
        System.out.println("TASK using Ozzy more simplified");
        words.stream()
                .map(String::length)
                .forEach(System.out::println);







    }
}
