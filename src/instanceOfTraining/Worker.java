package instanceOfTraining;

public class Worker extends Person{
    double salary;

    Worker(String surname, String name, double salary) {
        super(surname, name);
        this.salary = salary;
    }

    @Override
    void getDescription() {
        System.out.println("I'm the worker.");
        System.out.println("My surname is: " + surname);
        System.out.println("My name is: " + name);
        System.out.println("My salary is: " + salary);
    }
}
