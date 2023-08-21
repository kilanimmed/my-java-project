package functionalInterfaces;

import java.util.Map;
import java.util.function.*;

public class Examples {

    public static void main(String[] args) {

        //*********Predicate*******//

      /*  Predicate<Integer> lesserThan = new Predicate<Integer>() { // we cannot instantiate new object from Interfaces
            @Override                                               // This is Anonymous Class
            public boolean test(Integer integer) {
                return false;
            }
        };  */

        // Using Lambda Expressions
       // Type of interface: In this case, we are using Predicate Interface with Object Type as Integer
        Predicate<Integer> lesserThan = a -> a<18;  // Implementation of test method belongs to functional Interface
        // Lambda does not belong to any class so no need for public, Do we need return? compiler is smart enough to understand return type is boolean
        // so no need for boolean, also no need for method name since it will called by using action name which is lesserThan
        // Always remember that Lambda implements test method belongs to Predicate and has to have same signature
        // call the method and see the output
        Boolean results = lesserThan.test(50);
        System.out.println(results);




        //********Consumer********
        Consumer<Integer> display = i -> System.out.println(i);
        display.accept(50);

        //********BICONSUMER******
        BiConsumer<Integer,Integer> addTwo = (x,y) -> System.out.println(x+y);
        addTwo.accept(100,200);

        //*******Function*******
        Function<String,String> fun = s -> "Hello" + s;
        String str =fun.apply("Mohammed");
        System.out.println(str);

        //********SUPLIER*********
        Supplier<Double> randomValue = () -> Math.random();
        System.out.println(randomValue.get());

    }
}
