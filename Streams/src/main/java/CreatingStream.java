import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class CreatingStream {
    public static void main(String[] args) {

        //Creating Stream from Array

        String[] courses ={"Java","JS","TS"}; // Creating an Array of String
        Stream<String> courseStream = Arrays.stream(courses); // converting courses Array to Stream, Stream is ready to go the flow

        //Creating Stream from Collections: most used one in Dev
        List<String> courseList = Arrays.asList("Java","DS","Spring");
        Stream<String> courseStream2 = courseList.stream();

        //Creating Stream from Course class Object
        List<Course> myCourse = Arrays.asList(
                new Course("Java",100),
                new Course("DS",101),
                new Course("Spring",102),
                new Course("Microservices",103)
        );
        Stream<Course> myCourseStream = myCourse.stream();

        //Creating Stream from Values
        Stream<Integer> stream = Stream.of(1,2,3,4);


    }
}
