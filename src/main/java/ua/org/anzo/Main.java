package ua.org.anzo;

import java.util.*;


public class Main {


    public static void main(String[] args) {


        City city1 = new City("New York", 8);
        City city2 = new City("Odessa", 1);
        City city3 = new City("Kiev", 5);
        City city4 = new City("London", 8);
        City city5 = new City("Moscow", 11);

        Student student1 = new Student("Kolya", 20, city1);
        Student student2 = new Student("Dima", 21, city2);
        Student student3 = new Student("Kiril", 23, city3);
        Student student4 = new Student("Olya", 26, city4);
        Student student5 = new Student("Alena", 19, city5);


        List<Student> students = new ArrayList<Student>();

        students.add(student1);
        students.add(student2);
        students.add(student3);
        students.add(student4);
        students.add(student5);

        StudentComparator nameCom = new StudentComparator();

        Collections.sort(students, nameCom);

        System.out.println("Sort by Name :");
        System.out.println(students);


        AgeComparator ageCom = new AgeComparator();

        Collections.sort(students, ageCom);

        System.out.println("Sort by Age :");
        System.out.println(students);


        Collections.sort(students, (st1, st2) -> st2.getAge() - st1.getAge());
        System.out.println("Sort by age backward :");
        System.out.println(students);

        Collections.sort(students, (st3, st4) -> st3.getAge() - st4.getAge());
        System.out.println("Sort by age :");
        System.out.println(students);


    }
}


