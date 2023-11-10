package instanceOfTraining;

public class Student extends Person{

    Student(String surname, String name) {
        super(surname, name);
    }

    @Override
    void getDescription() {
        System.out.println("I'm the student.");
        System.out.println("My surname is: " + surname);
        System.out.println("My name is: " + name);
    }

}
