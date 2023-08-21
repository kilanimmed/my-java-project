import java.util.List;

public class EmployeeTest {
    public static void main(String[] args) {

        //Print all emails: One employee has one email - One to One
        EmployeeData.readAll()
                .map(Employee::getEmpEmail)
                .forEach(System.out::println);

        //Print all phone numbers
        System.out.println("******Printing all Phone Numbers as List of Stream ******");
        EmployeeData.readAll()
                .map(Employee::getEmpPhoneNumbers)
                .forEach(System.out::println);

        System.out.println("******Printing all Phone Numbers as Stream of String ******");
        EmployeeData.readAll()
                .flatMap(employee -> employee.getEmpPhoneNumbers().stream())
                .forEach(System.out::println);

        System.out.println("******Printing all Phone Numbers 2nd way ******");
        EmployeeData.readAll()
                .map(Employee::getEmpPhoneNumbers)
                .flatMap(List::stream)
                .forEach(System.out::println);
    }
}
