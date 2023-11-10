package instanceOfTraining;

abstract class Person {
    String surname;
    String name;

    Person(String surname, String name) {
        this.surname = surname;
        this.name = name;
    }

    abstract void getDescription();
}
