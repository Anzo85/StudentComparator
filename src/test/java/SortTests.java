import jdk.internal.instrumentation.TypeMapping;
import org.junit.Before;
import org.junit.Test;
import ua.org.anzo.AgeComparator;
import ua.org.anzo.City;
import ua.org.anzo.Student;
import ua.org.anzo.StudentComparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;


public class SortTests {


    @Test

    public void nameSort() {

        City city1 = new City("New York", 8);
        City city2 = new City("Odessa", 1);
        City city3 = new City("Kiev", 5);
        City city4 = new City("London", 8);
        City city5 = new City("Moscow", 11);

        Student student1 = new Student("Kolya", 20, city1);
        Student student2 = new Student("Dima", 21, city2);
        Student student3 = new Student("Kiril", 23, city3);
        Student student4 = new Student("Olya", 26, city4);
        Student student5 = new Student("ALena", 19, city5);

        List<Student> students = new ArrayList<Student>();

        students.add(student1);
        students.add(student2);
        students.add(student3);
        students.add(student4);
        students.add(student5);

        StudentComparator nameCom = new StudentComparator();

        Collections.sort(students, nameCom);
        String input = students.toString();
        String result = "[Name: ALena 19, Name: Dima 21, Name: Kiril 23, Name: Kolya 20, Name: Olya 26]";

        assertThat(input, is(result));
    }

    @Test
    public void nameAge(){

        City city1 = new City("New York", 8);
        City city2 = new City("Odessa", 1);
        City city3 = new City("Kiev", 5);
        City city4 = new City("London", 8);
        City city5 = new City("Moscow", 11);

        Student student1 = new Student("Kolya", 20, city1);
        Student student2 = new Student("Dima", 21, city2);
        Student student3 = new Student("Kiril", 23, city3);
        Student student4 = new Student("Olya", 26, city4);
        Student student5 = new Student("ALena", 19, city5);

        List<Student> students = new ArrayList<Student>();

        students.add(student1);
        students.add(student2);
        students.add(student3);
        students.add(student4);
        students.add(student5);

        AgeComparator nameAge = new AgeComparator();

        Collections.sort(students,nameAge);
        String input = students.toString();
        String result = "[Name: ALena 19, Name: Kolya 20, Name: Dima 21, Name: Kiril 23, Name: Olya 26]";

        assertThat(input , is(result));
    }

}
