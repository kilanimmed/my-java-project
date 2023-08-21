import java.util.Arrays;
import java.util.List;

public class StateTest {
    public static void main(String[] args) {

        State va = new State();
        va.addCity("McLean");
        va.addCity("Arlington");
        va.addCity("Fairfax");
        va.addCity("Falls Church");

        State tx = new State();
        tx.addCity("Dallas");
        tx.addCity("Plano");
        tx.addCity("Austin");
        tx.addCity("Houston");

        List<State> list = Arrays.asList(va, tx);

        list.stream().map(state -> state.getCity()).forEach(System.out::println);// Printing list of Cities in VA and List of Cities in TX Stream of Stream

        System.out.println("****Flat Map Stream****");
        list.stream()
                .map(state -> state.getCity())
                .flatMap(List::stream)
                .forEach(System.out::println);

        System.out.println("Another Way");
        list.stream()
                .flatMap(state -> state.getCity().stream())
                .forEach(System.out::println);
    }

}
