import java.time.LocalDate;

public abstract class Person implements Information {
    protected String name;
    protected String lastName;
    protected String gender;
    protected LocalDate birthdate;

    public Person(String name, String lastName, String gender, LocalDate birthdate) {
        this.name = name;
        this.lastName = lastName;
        this.gender = gender;
        this.birthdate = birthdate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public LocalDate getBirthdate() {
        return birthdate;
    }

    @Override
    public void mostrarInformacion() {
        System.out.println("Nombre: " + name + " " + lastName);
        System.out.println("Género: " + gender);
        System.out.println("Fecha de nacimiento: " + birthdate);
    }

    public abstract void showInformation();
}