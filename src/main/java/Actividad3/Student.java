package Actividad3;

public class Student implements Person {
    private String name;
    private int age;
    private String course;

    public Student(String name, int age, String course) {
        this.name = name;
        this.age = age;
        this.course = course;
    }

    @Override
    public String getInfo() {
        return "Nombre: " + name + ", Edad: " + age + ", Curso: " + course;
    }
}
