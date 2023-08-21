package doublecolonoperator;

import java.util.function.BiFunction;
import java.util.function.Consumer;

public class Demo {

    public static void main(String[] args) {

        //Reference to a static method
        Calculate s1 = (x,y) -> Calculator.findSome(x,y);// referencing a static method that does same method in Calculate interface
        s1.calculate(10,20);                       // instead of creating a new implementation just use the static method

        //Line 8 and line 12 are same
        Calculate s2 = Calculator::findSome;
        s2.calculate(100,35);

        //Reference to instance method,remember if it is an instance method it cannot be called directly we need to create a new object-> use Constructor
        Calculate m1 = (x,y) -> new Calculator().findMultiply(x,y);
        m1.calculate(5,6);

        Calculator obj = new Calculator();
        Calculate m2 = obj::findMultiply;
        m2.calculate(8,9);

        Calculate m3 = new Calculator()::findMultiply;
        m3.calculate(6,6);

        BiFunction<String,Integer,String> fn = (str,i) -> str.substring(i);
        System.out.println(fn.apply("Developer",6));

        BiFunction<String,Integer,String> fn2 = String::substring;
        System.out.println(fn2.apply("Developer",6));

        Consumer<Integer> display = i -> System.out.println(i);
        display.accept(20);

        Consumer<Integer> display2 = System.out::println;
        display2.accept(50);

        BiFunction<MyClass,Integer,Double> v2 = MyClass::method;

        BiFunction<String,String,String> v3 = String::concat;



    }
}
