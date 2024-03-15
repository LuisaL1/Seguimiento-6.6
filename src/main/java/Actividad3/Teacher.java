package Actividad3;

public class Teacher implements Person {
    private String name;
    private int age;
    private String subject;

    public Teacher(String name, int age, String subject) {
        this.name = name;
        this.age = age;
        this.subject = subject;
    }

    @Override
    public String getInfo() {
        return "Nombre: " + name + ", Edad: " + age + ", Materia: " + subject;
    }
}