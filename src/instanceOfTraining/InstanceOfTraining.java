package instanceOfTraining;

public class InstanceOfTraining {

    public static void main(String[] args) {
        Person[] person = new Person[4];
        person[0] = new Student("John", "Lenon");
        person[1] = new Worker("Bob", "Sinclear", 1500);

        person[0].getDescription();

        for (Person value : person) {
            if (value instanceof Person)
                value.getDescription();
            else break;
        }
    }
}
