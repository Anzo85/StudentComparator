package ua.org.anzo;


public class Student implements Comparable <Student>{


    private String name;
    private int age;
    private City city;


    public Student(String name, int age, City city) {
        this.name = name;
        this.age = age;
        this.city = city;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public City getCity() {
        return city;
    }

    @Override
    public boolean equals(Object o) {

        if (o == null) return false;
        if (o.getClass() != Student.class) return false;

        Student student = (Student) o;

        if (!student.name.equals(this.name)) return false;
        if (student.age != this.age) return false;
        if (!student.city.equals(this.city)) return false;
        return true;

    }

    @Override
    public String toString() {
        return "Name: " + name + " " +  age;
    }

    public int compareTo(Student student) {
        if(student.name.equals(this.name)) return 0 ;
        return -1;
    }



}

