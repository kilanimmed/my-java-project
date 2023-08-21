package src;

import java.util.*;

public class ArrayListReview {
    public static void main(String[] args) {

        List<Student> students = new ArrayList<>();

        students.add(new Student(1,"Jose"));
        students.add(new Student(2,"Sayed"));
        students.add(new Student(3, "Nick"));
        students.add(new Student(4,"Ronnie"));
        System.out.println(students);

        //Iteration on ArrayLists
        //1. For Loop with get(index)
        for(int i=0; i<students.size();i++){

            System.out.println(students.get(i));
        }

        //2. Iteration : Forward Iteration
        System.out.println("Printing with Iterator......");

        Iterator iter= students.listIterator();
        while(iter.hasNext()){
            System.out.println(iter.next());
        }

        //Backwards Iteration
        System.out.println("Printing with Backwards Iterator......");

        while(((ListIterator<?>) iter).hasPrevious()){
            System.out.println(((ListIterator<?>) iter).previous());
        }
       // 3. for each loop
        System.out.println("Printing with for each loop ......");
        for (Student student: students)
            System.out.println(student);

        // 4. Lambda
        System.out.println("Printing with Lambda ........");
        students.forEach(student -> System.out.println(student));

        //5. Sorting elements in List
        System.out.println("Printing with sorted list by comp.....");
        Collections.sort(students, new sortByIdDesc());
        System.out.println(students);

        //6. Sorting elements in List
        System.out.println("Printing with sorted list by Name Desc.....");
        Collections.sort(students, new sortByIdDesc());
        System.out.println(students);

    }
    static class sortByIdDesc implements Comparator<Student>{

        public int compare(Student s1, Student s2){
            return s2.id- s1.id;
        }
    }
    static class sortByNameDesc implements Comparator<Student>{

        public int compare(Student s1, Student s2){
            return s2.name.compareToIgnoreCase(s1.name);
        }
    }


    }




